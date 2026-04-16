package com.variesoft.app;

import com.variesoft.model.*;
import com.variesoft.repository.*;
import com.variesoft.service.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductoRepository productoRepository = new ProductoRepository();
        ClienteRepository clienteRepository = new ClienteRepository();
        FacturaRepository facturaRepository = new FacturaRepository();
        ProveedorRepository proveedorRepository = new ProveedorRepository();

        InventarioService inventarioService = new InventarioService(productoRepository);
        VentaService ventaService = new VentaService(facturaRepository, clienteRepository, inventarioService);
        ReporteService reporteService = new ReporteService(facturaRepository, productoRepository);

        Cliente cliente = new Cliente(1, "Juan Pérez", "juan@mail.com");
        clienteRepository.guardar(cliente);

        Proveedor proveedor = new Proveedor(1, "Proveedor Central", "8888-8888");
        proveedorRepository.guardar(proveedor);

        ProductoFisico producto1 = new ProductoFisico(1, "Bolso", 1200.0, "Accesorios", 10, 1.5);
        ProductoFisico producto2 = new ProductoFisico(2, "Perfume", 850.0, "Belleza", 15, 0.8);
        ProductoFisico producto3 = new ProductoFisico(3, "PC DE DURAN", 10.0, "Perreo", 20, 5.8);

        productoRepository.guardar(producto1);
        productoRepository.guardar(producto2);

        while (true) {
            System.out.println("\n===== VARIESOFT =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Registrar venta");
            System.out.println("3. Ver inventario");
            System.out.println("4. Ver reportes");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                for (Producto p : productoRepository.listar()) {
                    System.out.println(p);
                }
            } else if (opcion == 2) {
                Factura factura = new Factura(1, new Date(), "Efectivo", cliente);
                List<DetalleVenta> detalles = new ArrayList<>();

                System.out.print("ID producto: ");
                int idProducto = scanner.nextInt();

                System.out.print("Cantidad: ");
                int cantidad = scanner.nextInt();

                Producto producto = productoRepository.buscarPorId(idProducto);

                if (producto == null) {
                    System.out.println("Producto no encontrado.");
                    continue;
                }

                if (producto instanceof ProductoFisico) {
                    ProductoFisico fisico = (ProductoFisico) producto;
                    if (!fisico.verificarDisponibilidad(cantidad)) {
                        System.out.println("No hay suficiente stock.");
                        continue;
                    }
                    fisico.reducirStock(cantidad);
                }

                DetalleVenta detalle = new DetalleVenta(cantidad, producto.getPrecio());
                detalles.add(detalle);
                factura.setDetalles(detalles);
                factura.calcularTotal();

                ventaService.registrarVenta(factura);
                System.out.println("Venta registrada con total: " + factura.getTotal());
            } else if (opcion == 3) {
                inventarioService.mostrarInventario();
            } else if (opcion == 4) {
                reporteService.mostrarReporteVentas();
                reporteService.mostrarReporteInventario();
            } else if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
package com.variesoft.service;

import com.variesoft.model.Factura;
import com.variesoft.model.Producto;
import com.variesoft.repository.FacturaRepository;
import com.variesoft.repository.ProductoRepository;

public class ReporteService {
    private FacturaRepository facturaRepository;
    private ProductoRepository productoRepository;

    public ReporteService(FacturaRepository facturaRepository, ProductoRepository productoRepository) {
        this.facturaRepository = facturaRepository;
        this.productoRepository = productoRepository;
    }

    public void mostrarReporteVentas() {
        System.out.println("=== REPORTE DE VENTAS ===");
        for (Factura factura : facturaRepository.listar()) {
            System.out.println(factura);
        }
    }

    public void mostrarReporteInventario() {
        System.out.println("=== REPORTE DE INVENTARIO ===");
        for (Producto producto : productoRepository.listar()) {
            System.out.println(producto);
        }
    }
}
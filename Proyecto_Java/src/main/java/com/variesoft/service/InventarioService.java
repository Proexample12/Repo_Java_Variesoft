package com.variesoft.service;

import com.variesoft.model.Producto;
import com.variesoft.model.ProductoFisico;
import com.variesoft.repository.ProductoRepository;

public class InventarioService implements Administrador {
    private ProductoRepository productoRepository;

    public InventarioService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void gestionarInventario() {
        mostrarInventario();
    }

    public void mostrarInventario() {
        System.out.println("=== INVENTARIO ===");
        for (Producto producto : productoRepository.listar()) {
            System.out.println(producto);
            if (producto instanceof ProductoFisico) {
                ProductoFisico fisico = (ProductoFisico) producto;
                if (fisico.esBajoStock()) {
                    System.out.println("  ALERTA: stock bajo.");
                }
            }
        }
    }
}
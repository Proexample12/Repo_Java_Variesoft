package com.variesoft.repository;

import com.variesoft.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    public void guardar(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> listar() {
        return productos;
    }

    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getIdProducto() == id) {
                return p;
            }
        }
        return null;
    }
}

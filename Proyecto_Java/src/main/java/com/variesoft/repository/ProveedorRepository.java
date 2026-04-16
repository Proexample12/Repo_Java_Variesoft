package com.variesoft.repository;

import com.variesoft.model.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class ProveedorRepository {
    private List<Proveedor> proveedores = new ArrayList<>();

    public void guardar(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public List<Proveedor> listar() {
        return proveedores;
    }
}

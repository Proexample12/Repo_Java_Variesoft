package com.variesoft.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String email;
    private List<String> historialCompras;

    public Cliente(int id, String nombre, String email) {
        super(id, nombre);
        this.email = email;
        this.historialCompras = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void agregarCompra(String compra) {
        historialCompras.add(compra);
    }

    public List<String> obtenerHistorialCompras() {
        return historialCompras;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + "', email='" + email + "'}";
    }
}
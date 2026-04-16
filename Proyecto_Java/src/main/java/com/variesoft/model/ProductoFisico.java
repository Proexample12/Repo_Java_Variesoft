package com.variesoft.model;

public class ProductoFisico extends Producto {
    private int stock;
    private double peso;

    public ProductoFisico(int idProducto, String nombreProducto, double precio, String categoria, int stock, double peso) {
        super(idProducto, nombreProducto, precio, categoria);
        this.stock = stock;
        this.peso = peso;
    }

    public int getStock() {
        return stock;
    }

    public double getPeso() {
        return peso;
    }

    public boolean verificarDisponibilidad(int cantidad) {
        return stock >= cantidad;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    @Override
    public boolean esBajoStock() {
        return stock <= 5;
    }

    @Override
    public String toString() {
        return "ProductoFisico{id=" + idProducto + ", nombre='" + nombreProducto + "', precio=" + precio +
                ", categoria='" + categoria + "', stock=" + stock + ", peso=" + peso + "}";
    }
}

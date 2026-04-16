package com.variesoft.model;

public class Producto {
    protected int idProducto;
    protected String nombreProducto;
    protected double precio;
    protected String categoria;

    public Producto(int idProducto, String nombreProducto, double precio, String categoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void aplicarDescuento(double porcentaje) {
        this.precio = this.precio - (this.precio * porcentaje / 100.0);
    }

    public boolean esBajoStock() {
        return false;
    }

    @Override
    public String toString() {
        return "Producto{id=" + idProducto + ", nombre='" + nombreProducto + "', precio=" + precio + ", categoria='" + categoria + "'}";
    }
}

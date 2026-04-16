package com.variesoft.model;

public class DetalleVenta {
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    public DetalleVenta(int cantidad, double precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = calcularSubtotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcularSubtotal() {
        this.subtotal = cantidad * precioUnitario;
        return subtotal;
    }
}

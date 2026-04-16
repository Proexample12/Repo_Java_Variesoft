package com.variesoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private int idVenta;
    private Date fecha;
    private double total;
    private String metodoPago;
    private Cliente cliente;
    private List<DetalleVenta> detalles;

    public Factura(int idVenta, Date fecha, String metodoPago, Cliente cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public void calcularTotal() {
        total = 0;
        for (DetalleVenta d : detalles) {
            total += d.calcularSubtotal();
        }
    }

    @Override
    public String toString() {
        return "Factura{idVenta=" + idVenta + ", fecha=" + fecha + ", total=" + total + ", metodoPago='" + metodoPago + "'}";
    }
}

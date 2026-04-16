package com.variesoft.repository;

import com.variesoft.model.Factura;

import java.util.ArrayList;
import java.util.List;

public class FacturaRepository {
    private List<Factura> facturas = new ArrayList<>();

    public void guardar(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> listar() {
        return facturas;
    }
}

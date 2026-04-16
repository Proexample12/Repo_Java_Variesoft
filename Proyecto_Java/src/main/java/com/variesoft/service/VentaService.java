package com.variesoft.service;

import com.variesoft.model.Cliente;
import com.variesoft.model.Factura;
import com.variesoft.repository.ClienteRepository;
import com.variesoft.repository.FacturaRepository;

public class VentaService implements Vendedor {
    private FacturaRepository facturaRepository;
    private ClienteRepository clienteRepository;
    private InventarioService inventarioService;

    public VentaService(FacturaRepository facturaRepository, ClienteRepository clienteRepository, InventarioService inventarioService) {
        this.facturaRepository = facturaRepository;
        this.clienteRepository = clienteRepository;
        this.inventarioService = inventarioService;
    }

    @Override
    public void registrarVenta(Factura factura) {
        facturaRepository.guardar(factura);
        Cliente cliente = factura.getCliente();
        cliente.agregarCompra("Factura #" + factura.getIdVenta() + " total: " + factura.getTotal());
        clienteRepository.actualizar(cliente);
    }
}

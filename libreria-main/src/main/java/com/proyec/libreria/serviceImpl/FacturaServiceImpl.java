package com.proyec.libreria.serviceImpl;

import com.proyec.libreria.entity.Facturas;
import com.proyec.libreria.repository.FacturaRepository;
import com.proyec.libreria.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Facturas> obtenerTodasLasFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public Facturas obtenerFacturaPorId(Long id) {
        Optional<Facturas> factura = facturaRepository.findById(id);
        return factura.orElseThrow(() -> new RuntimeException("Factura no encontrada con ID: " + id));
    }

    @Override
    public Facturas crearFactura(Facturas factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Facturas actualizarFactura(Long id, Facturas factura) {
        Facturas facturaExistente = obtenerFacturaPorId(id);
        facturaExistente.setIdUsuario(factura.getIdUsuario());
        facturaExistente.setFechaFactura(factura.getFechaFactura());
        facturaExistente.setTotal(factura.getTotal());
        return facturaRepository.save(facturaExistente);
    }

    @Override
    public void eliminarFactura(Long id) {
        Facturas factura = obtenerFacturaPorId(id);
        facturaRepository.delete(factura);
    }
}

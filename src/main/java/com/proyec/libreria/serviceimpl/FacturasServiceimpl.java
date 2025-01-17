package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.Facturas;
import com.proyec.libreria.repository.FacturasRepository;
import com.proyec.libreria.service.FacturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasServiceimpl implements FacturasService {

    @Autowired
    private FacturasRepository facturasRepository;

    @Override
    public Facturas saveFactura(Facturas factura) {
        return facturasRepository.save(factura); // Guarda la factura en la base de datos
    }

    @Override
    public Facturas updateFactura(Facturas factura, Long id) {
        // Verificamos si la factura existe en la base de datos
        if (facturasRepository.existsById(id)) {
            // Si existe, asignamos el id de la factura para actualizarla
            factura.setId_factura(id);
            return facturasRepository.save(factura); // Guarda la factura actualizada
        }
        return null; // Si no existe, devolvemos null o puedes lanzar una excepción personalizada
    }

    @Override
    public Facturas getFacturaById(Long id) {
        return facturasRepository.findById(id).orElse(null); // Devuelve la factura si existe o null
    }

    @Override
    public void deleteFactura(Long id) {
        facturasRepository.deleteById(id); // Elimina la factura por su id
    }

    @Override
    public List<Facturas> getAllFacturas() {
        return facturasRepository.findAll(); // Devuelve todas las facturas de la base de datos
    }
}

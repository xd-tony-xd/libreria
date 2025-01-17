package com.proyec.libreria.service;

import com.proyec.libreria.entity.Facturas;
import java.util.List;

public interface FacturasService {
    // Guardar una nueva factura
    Facturas saveFactura(Facturas factura);

    // Actualizar una factura existente
    Facturas updateFactura(Facturas factura, Long id);

    // Obtener una factura por su id
    Facturas getFacturaById(Long id);

    // Eliminar una factura por su id
    void deleteFactura(Long id);

    // Obtener todas las facturas
    List<Facturas> getAllFacturas();
}

package com.proyec.libreria.service;

import com.proyec.libreria.entity.Facturas;
import java.util.List;

public interface FacturaService {

    // Obtener todas las facturas
    List<Facturas> obtenerTodasLasFacturas();

    // Obtener una factura por ID
    Facturas obtenerFacturaPorId(Long id);

    // Crear una nueva factura
    Facturas crearFactura(Facturas factura);

    // Actualizar una factura existente
    Facturas actualizarFactura(Long id, Facturas factura);

    // Eliminar una factura por ID
    void eliminarFactura(Long id);
}

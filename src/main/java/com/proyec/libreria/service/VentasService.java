package com.proyec.libreria.service;

import com.proyec.libreria.entity.Ventas;
import java.util.List;

public interface VentasService {
    Ventas saveVenta(Ventas venta);
    Ventas updateVenta(Ventas venta, Long id);
    Ventas getVentaById(Long id);
    void deleteVenta(Long id);
    List<Ventas> getAllVentas();
}

package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Facturas;
import com.proyec.libreria.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas") // Ruta base para la API
public class FacturaController {

    @Autowired
    private FacturaService facturasService;

    // Obtener todas las facturas
    @GetMapping
    public ResponseEntity<List<Facturas>> obtenerTodasLasFacturas() {
        List<Facturas> facturas = facturasService.obtenerTodasLasFacturas();
        return new ResponseEntity<>(facturas, HttpStatus.OK);
    }

    // Obtener una factura por ID
    @GetMapping("/{id}")
    public ResponseEntity<Facturas> obtenerFacturaPorId(@PathVariable Long id) {
        Facturas factura = facturasService.obtenerFacturaPorId(id);
        return new ResponseEntity<>(factura, HttpStatus.OK);
    }

    // Crear una nueva factura
    @PostMapping
    public ResponseEntity<Facturas> crearFactura(@RequestBody Facturas factura) {
        Facturas nuevaFactura = facturasService.crearFactura(factura);
        return new ResponseEntity<>(nuevaFactura, HttpStatus.CREATED);
    }

    // Actualizar una factura existente
    @PutMapping("/{id}")
    public ResponseEntity<Facturas> actualizarFactura(@PathVariable Long id, @RequestBody Facturas factura) {
        Facturas facturaActualizada = facturasService.actualizarFactura(id, factura);
        return new ResponseEntity<>(facturaActualizada, HttpStatus.OK);
    }

    // Eliminar una factura por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFactura(@PathVariable Long id) {
        facturasService.eliminarFactura(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

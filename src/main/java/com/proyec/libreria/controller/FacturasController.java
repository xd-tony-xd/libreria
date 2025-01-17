package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Facturas;
import com.proyec.libreria.service.FacturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturasController {

    @Autowired
    private FacturasService facturasService;

    // Crear una nueva factura
    // POST http://localhost:8080/api/facturas
    @PostMapping
    public ResponseEntity<Facturas> createFactura(@RequestBody Facturas factura) {
        Facturas nuevaFactura = facturasService.saveFactura(factura);
        return ResponseEntity.ok(nuevaFactura);
    }

    // Actualizar una factura existente
    // PUT http://localhost:8080/api/facturas/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Facturas> updateFactura(@PathVariable Long id, @RequestBody Facturas factura) {
        Facturas facturaActualizada = facturasService.updateFactura(factura, id);
        if (facturaActualizada == null) {
            return ResponseEntity.notFound().build();  // Si no se encuentra la factura
        }
        return ResponseEntity.ok(facturaActualizada);
    }

    // Obtener una factura por su ID
    // GET http://localhost:8080/api/facturas/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Facturas> getFacturaById(@PathVariable Long id) {
        Facturas factura = facturasService.getFacturaById(id);
        if (factura == null) {
            return ResponseEntity.notFound().build();  // Si no se encuentra la factura
        }
        return ResponseEntity.ok(factura);
    }

    // Eliminar una factura por su ID
    // DELETE http://localhost:8080/api/facturas/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFactura(@PathVariable Long id) {
        facturasService.deleteFactura(id);
        return ResponseEntity.noContent().build();
    }

    // Obtener todas las facturas
    // GET http://localhost:8080/api/facturas
    @GetMapping
    public ResponseEntity<List<Facturas>> getAllFacturas() {
        List<Facturas> facturas = facturasService.getAllFacturas();
        return ResponseEntity.ok(facturas);
    }
}

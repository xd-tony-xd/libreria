package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Ventas;
import com.proyec.libreria.service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {

    @Autowired
    private VentasService ventasService;

    @PostMapping
    public Ventas saveVenta(@RequestBody Ventas venta) {
        return ventasService.saveVenta(venta);
    }

    @PutMapping("/{id}")
    public Ventas updateVenta(@RequestBody Ventas venta, @PathVariable Long id) {
        return ventasService.updateVenta(venta, id);
    }

    @GetMapping("/{id}")
    public Ventas getVentaById(@PathVariable Long id) {
        return ventasService.getVentaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVenta(@PathVariable Long id) {
        ventasService.deleteVenta(id);
    }

    @GetMapping
    public List<Ventas> getAllVentas() {
        return ventasService.getAllVentas();
    }
}

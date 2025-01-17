package com.proyec.libreria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyec.libreria.entity.Ventas;
import com.proyec.libreria.service.VentasService;

@RestController
@RequestMapping("/v1/ventas")
public class VentasController {

	
	@Autowired
    private VentasService ventasService;

    @GetMapping("/ventas")
    public List<Ventas> findAllVentas() {
        return ventasService.getAllVentas();
    }


    @PostMapping("/ventas/create")
    public Long createVenta(@RequestBody Ventas venta) {
        return ventasService.saveVenta(venta).getId_venta();
    }

    @PutMapping("/ventas/{idVenta}")
    public Ventas updateVenta(@PathVariable Long idVenta, @RequestBody Ventas venta) {
        return ventasService.updateVenta(Venta, idVenta);
    }

    @DeleteMapping("/ventas/delete/{idVenta}")
    public void deleteVenta(@PathVariable Long idVenta) {
    	ventasService.deleteVenta(idVenta);
    }

    @GetMapping("/ventas/{idVenta}")
    public Ventas getVentaById(@PathVariable Long idVenta) {
        return ventasService.getVentaById(idVenta);
    }
}

package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Proveedores;
import com.proyec.libreria.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {

    @Autowired
    private ProveedoresService proveedoresService;

    @PostMapping
    public Proveedores saveProveedor(@RequestBody Proveedores proveedor) {
        return proveedoresService.saveProveedor(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedores updateProveedor(@RequestBody Proveedores proveedor, @PathVariable Long id) {
        return proveedoresService.updateProveedor(proveedor, id);
    }

    @GetMapping("/{id}")
    public Proveedores getProveedorById(@PathVariable Long id) {
        return proveedoresService.getProveedorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProveedor(@PathVariable Long id) {
        proveedoresService.deleteProveedor(id);
    }

    @GetMapping
    public List<Proveedores> getAllProveedores() {
        return proveedoresService.getAllProveedores();
    }
}

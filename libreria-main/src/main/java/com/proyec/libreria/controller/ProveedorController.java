package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Proveedores;
import com.proyec.libreria.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedoresService proveedoresService;

    // Obtener todos los proveedores
    @GetMapping
    public List<Proveedores> getAllProveedores() {
        return proveedoresService.getAllProveedores();
    }

    // Obtener proveedor por ID
    @GetMapping("/{id}")
    public ResponseEntity<Proveedores> getProveedorById(@PathVariable Long id) {
        Optional<Proveedores> proveedor = proveedoresService.getProveedorById(id);
        if (proveedor.isPresent()) {
            return new ResponseEntity<>(proveedor.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Crear un nuevo proveedor
    @PostMapping
    public ResponseEntity<Proveedores> createProveedor(@RequestBody Proveedores proveedor) {
        Proveedores savedProveedor = proveedoresService.saveOrUpdateProveedor(proveedor);
        return new ResponseEntity<>(savedProveedor, HttpStatus.CREATED);
    }

    // Actualizar un proveedor existente
    @PutMapping("/{id}")
    public ResponseEntity<Proveedores> updateProveedor(@PathVariable Long id, @RequestBody Proveedores proveedor) {
        Optional<Proveedores> existingProveedor = proveedoresService.getProveedorById(id);
        if (existingProveedor.isPresent()) {
            proveedor.setId_proveedor(id);  // Asegura que se mantenga el mismo ID
            Proveedores updatedProveedor = proveedoresService.saveOrUpdateProveedor(proveedor);
            return new ResponseEntity<>(updatedProveedor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Eliminar un proveedor
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProveedor(@PathVariable Long id) {
        proveedoresService.deleteProveedor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


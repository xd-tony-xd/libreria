package com.proyec.libreria.controller;


import com.proyec.libreria.entity.ProductoGeneral;
import com.proyec.libreria.service.ProductoGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoGeneralController {

    @Autowired
    private ProductoGeneralService productoGeneralService;

    @GetMapping
    public List<ProductoGeneral> getAllProductos() {
        return productoGeneralService.getAllProductos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoGeneral> getProductoById(@PathVariable Integer id) {
        ProductoGeneral producto = productoGeneralService.getProductoById(id);
        if (producto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(producto);
    }

    @PostMapping
    public ResponseEntity<ProductoGeneral> createProducto(@RequestBody ProductoGeneral producto) {
        ProductoGeneral createdProducto = productoGeneralService.createProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProducto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductoGeneral> updateProducto(@PathVariable Integer id, @RequestBody ProductoGeneral producto) {
        ProductoGeneral updatedProducto = productoGeneralService.updateProducto(id, producto);
        if (updatedProducto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(updatedProducto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Integer id) {
        productoGeneralService.deleteProducto(id);
        return ResponseEntity.noContent().build();
    }
}

package com.proyec.libreria.controller;

import com.proyec.libreria.entity.ProductosGenerales;
import com.proyec.libreria.service.ProductosGeneralesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductosGeneralesController {

    @Autowired
    private ProductosGeneralesService productosGeneralesService;

    @PostMapping
    public ProductosGenerales saveProducto(@RequestBody ProductosGenerales producto) {
        return productosGeneralesService.saveProducto(producto);
    }

    @PutMapping("/{id}")
    public ProductosGenerales updateProducto(@RequestBody ProductosGenerales producto, @PathVariable Long id) {
        return productosGeneralesService.updateProducto(producto, id);
    }

    @GetMapping("/{id}")
    public ProductosGenerales getProductoById(@PathVariable Long id) {
        return productosGeneralesService.getProductoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productosGeneralesService.deleteProducto(id);
    }

    @GetMapping
    public List<ProductosGenerales> getAllProductos() {
        return productosGeneralesService.getAllProductos();
    }
}

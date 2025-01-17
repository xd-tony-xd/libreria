package com.proyec.libreria.controller;

import com.proyec.libreria.entity.CategoriasProductos;
import com.proyec.libreria.service.CategoriasProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasProductosController {

    @Autowired
    private CategoriasProductosService categoriasProductosService;

    @PostMapping
    public ResponseEntity<CategoriasProductos> createCategoria(@RequestBody CategoriasProductos categoria) {
        return ResponseEntity.ok(categoriasProductosService.saveCategoria(categoria));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriasProductos> updateCategoria(@PathVariable Long id, @RequestBody CategoriasProductos categoria) {
        CategoriasProductos updatedCategoria = categoriasProductosService.updateCategoria(categoria, id);
        return updatedCategoria != null ? ResponseEntity.ok(updatedCategoria) : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriasProductos> getCategoriaById(@PathVariable Long id) {
        CategoriasProductos categoria = categoriasProductosService.getCategoriaById(id);
        return categoria != null ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long id) {
        categoriasProductosService.deleteCategoria(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<CategoriasProductos>> getAllCategorias() {
        return ResponseEntity.ok(categoriasProductosService.getAllCategorias());
    }
}

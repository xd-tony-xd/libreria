package com.proyec.libreria.controller;


import com.proyec.libreria.entity.CategoriaProducto;
import com.proyec.libreria.service.CategoriaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaProductoController {

    @Autowired
    private CategoriaProductoService categoriaProductoService;

    @GetMapping
    public List<CategoriaProducto> getAllCategorias() {
        return categoriaProductoService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaProducto> getCategoriaById(@PathVariable Integer id) {
        CategoriaProducto categoria = categoriaProductoService.getCategoriaById(id); 
        if (categoria == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public ResponseEntity<CategoriaProducto> createCategoria(@RequestBody CategoriaProducto categoria) {
        CategoriaProducto createdCategoria = categoriaProductoService.createCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaProducto> updateCategoria(@PathVariable Integer id, @RequestBody CategoriaProducto categoria) {
        CategoriaProducto updatedCategoria = categoriaProductoService.updateCategoria(id, categoria);
        if (updatedCategoria == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(updatedCategoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Integer id) {
        categoriaProductoService.deleteCategoria(id);
        return ResponseEntity.noContent().build();
    }
}

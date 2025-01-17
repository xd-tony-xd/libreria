package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Libros;
import com.proyec.libreria.service.LibrosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/libreria")
public class LibrosController {


    @Autowired
    private LibrosService librosService;

    @GetMapping("/libros")
    public List<Libros> findAllLibros() {
        return librosService.getAllLibros();
    }


    @PostMapping("/libros/create")
    public Long createLibro(@RequestBody Libros libro) {
        return librosService.saveLibro(libro).getId_libro();
    }

    @PutMapping("/libros/{idLibro}")
    public Libros updateLibro(@PathVariable Long idLibro, @RequestBody Libros libro) {
        return librosService.updateLibro(libro, idLibro);
    }

    @DeleteMapping("/libros/delete/{idLibro}")
    public void deleteLibro(@PathVariable Long idLibro) {
        librosService.deleteLibro(idLibro);
    }

    @GetMapping("/libros/{idLibro}")
    public Libros getLibroById(@PathVariable Long idLibro) {
        return librosService.getLibroById(idLibro);
    }
}

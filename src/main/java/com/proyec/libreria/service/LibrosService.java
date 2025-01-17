package com.proyec.libreria.service;

import com.proyec.libreria.entity.Libros;
import java.util.List; // Importante para el tipo de retorno

public interface LibrosService {
    // Método para guardar un nuevo libro
    Libros saveLibro(Libros libro);

    // Método para actualizar un libro existente
    Libros updateLibro(Libros libro, Long id);

    // Método para obtener un libro por su id
    Libros getLibroById(Long id);

    // Método para eliminar un libro por su id
    void deleteLibro(Long id);

    // Nuevo método para obtener todos los libros
    List<Libros> getAllLibros(); // Agregado aquí
}

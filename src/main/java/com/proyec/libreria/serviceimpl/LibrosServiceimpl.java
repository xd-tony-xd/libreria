package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.Libros;
import com.proyec.libreria.repository.LibrosRepository;
import com.proyec.libreria.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibrosServiceimpl implements LibrosService {

    @Autowired
    private LibrosRepository librosRepository;

    @Override
    public Libros saveLibro(Libros libro) {
        return librosRepository.save(libro);
    }

    @Override
    public Libros updateLibro(Libros libro, Long id) {
        if (librosRepository.existsById(id)) {
            libro.setId_libro(id);
            return librosRepository.save(libro);
        }
        return null; // o puedes lanzar una excepción si no existe el libro
    }

    @Override
    public Libros getLibroById(Long id) {
        return librosRepository.findById(id).orElse(null); // Retorna null si no existe
    }

    @Override
    public void deleteLibro(Long id) {
        librosRepository.deleteById(id);
    }

    @Override
    public List<Libros> getAllLibros() {
        return librosRepository.findAll(); // Devuelve todos los libros desde el repositorio
    }
}

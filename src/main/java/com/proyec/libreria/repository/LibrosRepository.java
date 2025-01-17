package com.proyec.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyec.libreria.entity.Libros;

public interface LibrosRepository extends JpaRepository<Libros, Long> {

}

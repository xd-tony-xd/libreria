package com.proyec.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyec.libreria.entity.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}

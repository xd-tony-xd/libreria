package com.proyec.libreria.repository;

import com.proyec.libreria.entity.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Facturas, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}

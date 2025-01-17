package com.proyec.libreria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyec.libreria.entity.ProductoGeneral;

@Repository
public interface ProductoGeneralRepository extends JpaRepository<ProductoGeneral, Integer> {
}

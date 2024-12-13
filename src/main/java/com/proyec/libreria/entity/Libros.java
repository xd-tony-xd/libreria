package com.proyec.libreria.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_libro;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "autor", length = 100)
    private String autor;
//Ofrece precisión exacta y no pierde información al realizar operaciones matemáticas.puedes asegurarte de que no haya errores de redondeo.
    @Column(name = "precio", nullable = false)
    private BigDecimal precio;


    @Column(name = "stock", nullable = false)
    private Integer stock;
}

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
@Table(name = "productosgenerales")
@Getter
@Setter
public class ProductosGenerales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "PRECIO", nullable = false)
    private BigDecimal precio;

    @Column(name = "STOCK", nullable = false)
    private Integer stock;
}

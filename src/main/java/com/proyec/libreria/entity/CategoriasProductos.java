package com.proyec.libreria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categorias_productos")
@Getter
@Setter
public class CategoriasProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;

    @Column(name = "NOMBRECATEGORIA", nullable = false)
    private String nombreCategoria;

    @Column(name = "DESCRIPCION", nullable =false)
    private String descripcion;	
    

}

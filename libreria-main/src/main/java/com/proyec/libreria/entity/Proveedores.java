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
@Table(name = "proveedores")
@Getter
@Setter
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proveedor;

    @Column(name = "NOMBRE_PROVEEDOR", nullable = false)
    private String nombre_proveedor;

    @Column(name = "TELEFONO", nullable = false, unique = true)
    private String telefono;

    @Column(name = "CORREOPROVEEDOR", nullable = false)
    private String correoproveedor;

    @Column(name = "DIRECCION", nullable = false)
    private String direccion;  
    
    

    @ManyToOne(optional = false )
    @JoinColumn(name = "id_producto")
    private ProductosGenerales proveedores;

}


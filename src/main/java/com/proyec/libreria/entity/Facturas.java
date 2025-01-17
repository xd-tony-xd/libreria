package com.proyec.libreria.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
@Getter
@Setter
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_factura;

    // Clave foránea del usuario (referencia al ID de la tabla Usuarios)
   

    // Fecha y hora de la factura
    @Column(name = "fecha_factura", nullable = false)
    private LocalDateTime fechaFactura = LocalDateTime.now();  // Se establece el valor por defecto en el código

    // Total de la factura
    @Column(name = "total", nullable = false)
    private BigDecimal total;

    
    
    @ManyToOne(optional = false )
    @JoinColumn(name = "id_usuario")
    private Usuarios facturas;
   

}

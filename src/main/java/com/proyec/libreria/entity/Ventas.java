package com.proyec.libreria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "ventas")
@Getter
@Setter
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Venta;

    @Column(name = "id_factura", nullable = false)
    private Long idFactura;  // Cambio: Referencia directa al id de la factura

    @Column(name = "id_producto", nullable = false)
    private Long idProducto;  // Cambio: Referencia directa al id del producto

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "precio_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    @Column(name = "total_venta", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalVenta;
    
    
}

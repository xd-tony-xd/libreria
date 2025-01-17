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
    @Column(name = "idusuario", nullable = false)
    private Long idUsuario;

    // Fecha y hora de la factura
    @Column(name = "fecha_factura", nullable = false)
    private LocalDateTime fechaFactura = LocalDateTime.now();  // Se establece el valor por defecto en el código

    // Total de la factura
    @Column(name = "total", nullable = false)
    private BigDecimal total;
    
    public Facturas() {
		super();
	}

	public Facturas(Long id_factura, Long idUsuario, LocalDateTime fechaFactura, BigDecimal total, Usuarios facturas) {
		super();
		this.id_factura = id_factura;
		this.idUsuario = idUsuario;
		this.fechaFactura = fechaFactura;
		this.total = total;
		this.facturas = facturas;
	}

	public Long getId_factura() {
		return id_factura;
	}

	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDateTime getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDateTime fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Usuarios getFacturas() {
		return facturas;
	}

	public void setFacturas(Usuarios facturas) {
		this.facturas = facturas;
	}







	@ManyToOne(optional = false )
    @JoinColumn(name = "id_usuario")
    private Usuarios facturas;
   

}

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
    
    

    public Proveedores() {
		super();
	}
	public Proveedores(Long id_proveedor, String nombre_proveedor, String telefono, String correoproveedor,
			String direccion, ProductosGenerales proveedores) {
		super();
		this.id_proveedor = id_proveedor;
		this.nombre_proveedor = nombre_proveedor;
		this.telefono = telefono;
		this.correoproveedor = correoproveedor;
		this.direccion = direccion;
		this.proveedores = proveedores;
	}

	public Long getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(Long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoproveedor() {
		return correoproveedor;
	}
	public void setCorreoproveedor(String correoproveedor) {
		this.correoproveedor = correoproveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ProductosGenerales getProveedores() {
		return proveedores;
	}
	public void setProveedores(ProductosGenerales proveedores) {
		this.proveedores = proveedores;
	}




	@ManyToOne(optional = false )
    @JoinColumn(name = "id_producto")
    private ProductosGenerales proveedores;

}


	package com.proyec.libreria.repository;
	
	import com.proyec.libreria.entity.Facturas;
	import org.springframework.data.jpa.repository.JpaRepository;
	
	public interface FacturasRepository extends JpaRepository<Facturas, Long> {
	
	}

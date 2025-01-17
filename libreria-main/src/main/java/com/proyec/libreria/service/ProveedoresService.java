package com.proyec.libreria.service;

import com.proyec.libreria.entity.Proveedores;

import java.util.List;
import java.util.Optional;

public interface ProveedoresService {

    Proveedores saveOrUpdateProveedor(Proveedores proveedor);

    List<Proveedores> getAllProveedores();

    Optional<Proveedores> getProveedorById(Long id);

    void deleteProveedor(Long id);
}

package com.proyec.libreria.service;

import com.proyec.libreria.entity.Proveedores;
import java.util.List;

public interface ProveedoresService {
    Proveedores saveProveedor(Proveedores proveedor);
    Proveedores updateProveedor(Proveedores proveedor, Long id);
    Proveedores getProveedorById(Long id);
    void deleteProveedor(Long id);
    List<Proveedores> getAllProveedores();
}

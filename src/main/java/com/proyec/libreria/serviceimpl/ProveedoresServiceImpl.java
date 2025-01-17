package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.Proveedores;
import com.proyec.libreria.repository.ProveedoresRepository;
import com.proyec.libreria.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Override
    public Proveedores saveProveedor(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @Override
    public Proveedores updateProveedor(Proveedores proveedor, Long id) {
        if (proveedoresRepository.existsById(id)) {
            proveedor.setId_proveedor(id);
            return proveedoresRepository.save(proveedor);
        }
        return null;
    }

    @Override
    public Proveedores getProveedorById(Long id) {
        return proveedoresRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProveedor(Long id) {
        proveedoresRepository.deleteById(id);
    }

    @Override
    public List<Proveedores> getAllProveedores() {
        return proveedoresRepository.findAll();
    }
}

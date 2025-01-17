package com.proyec.libreria.serviceImpl;

import com.proyec.libreria.entity.Proveedores;
import com.proyec.libreria.repository.ProveedoresRepository;
import com.proyec.libreria.service.ProveedoresService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Override
    public Proveedores saveOrUpdateProveedor(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @Override
    public List<Proveedores> getAllProveedores() {
        return proveedoresRepository.findAll();
    }

    @Override
    public Optional<Proveedores> getProveedorById(Long id) {
        return proveedoresRepository.findById(id);
    }

    @Override
    public void deleteProveedor(Long id) {
        proveedoresRepository.deleteById(id);
    }
}


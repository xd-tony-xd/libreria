package com.proyec.libreria.service.impl;

import com.proyec.libreria.Repository.ProductoGeneralRepository;
import com.proyec.libreria.entity.ProductoGeneral;
import com.proyec.libreria.service.ProductoGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoGeneralServiceImpl implements ProductoGeneralService {

    @Autowired
    private ProductoGeneralRepository productoGeneralRepository;

    @Override
    public List<ProductoGeneral> getAllProductos() {
        return productoGeneralRepository.findAll();
    }

    @Override
    public ProductoGeneral getProductoById(Integer id) {
        Optional<ProductoGeneral> producto = productoGeneralRepository.findById(id);
        return producto.orElse(null);
    }

    @Override
    public ProductoGeneral createProducto(ProductoGeneral producto) {
        return productoGeneralRepository.save(producto);
    }

    @Override
    public ProductoGeneral updateProducto(Integer id, ProductoGeneral producto) {
        if (productoGeneralRepository.existsById(id)) {
            producto.setIdProducto(id);
            return productoGeneralRepository.save(producto);
        }
        return null;
    }

    @Override
    public void deleteProducto(Integer id) {
        productoGeneralRepository.deleteById(id);
    }
}

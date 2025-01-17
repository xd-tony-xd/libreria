package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.ProductosGenerales;
import com.proyec.libreria.repository.ProductosGeneralesRepository;
import com.proyec.libreria.service.ProductosGeneralesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosGeneralesServiceImpl implements ProductosGeneralesService {

    @Autowired
    private ProductosGeneralesRepository productosGeneralesRepository;

    @Override
    public ProductosGenerales saveProducto(ProductosGenerales producto) {
        return productosGeneralesRepository.save(producto);
    }

    @Override
    public ProductosGenerales updateProducto(ProductosGenerales producto, Long id) {
        if (productosGeneralesRepository.existsById(id)) {
            producto.setId_producto(id);
            return productosGeneralesRepository.save(producto);
        }
        return null;
    }

    @Override
    public ProductosGenerales getProductoById(Long id) {
        return productosGeneralesRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProducto(Long id) {
        productosGeneralesRepository.deleteById(id);
    }

    @Override
    public List<ProductosGenerales> getAllProductos() {
        return productosGeneralesRepository.findAll();
    }
}

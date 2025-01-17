package com.proyec.libreria.service;

import com.proyec.libreria.entity.ProductosGenerales;
import java.util.List;

public interface ProductosGeneralesService {
    ProductosGenerales saveProducto(ProductosGenerales producto);
    ProductosGenerales updateProducto(ProductosGenerales producto, Long id);
    ProductosGenerales getProductoById(Long id);
    void deleteProducto(Long id);
    List<ProductosGenerales> getAllProductos();
}

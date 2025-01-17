package com.proyec.libreria.service;


import java.util.List;

import com.proyec.libreria.entity.ProductoGeneral;

public interface ProductoGeneralService {
    
    List<ProductoGeneral> getAllProductos();
    
    ProductoGeneral getProductoById(Integer id);
    
    ProductoGeneral createProducto(ProductoGeneral producto);
    
    ProductoGeneral updateProducto(Integer id, ProductoGeneral producto);
    
    void deleteProducto(Integer id);
}

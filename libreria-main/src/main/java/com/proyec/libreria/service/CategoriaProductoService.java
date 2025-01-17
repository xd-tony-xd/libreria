package com.proyec.libreria.service;


import java.util.List;

import com.proyec.libreria.entity.CategoriaProducto;

public interface CategoriaProductoService {
    
    List<CategoriaProducto> getAllCategorias();
    
    CategoriaProducto getCategoriaById(Integer id);
    
    CategoriaProducto createCategoria(CategoriaProducto categoria);
    
    CategoriaProducto updateCategoria(Integer id, CategoriaProducto categoria);
    
    void deleteCategoria(Integer id);
}

package com.proyec.libreria.service;

import com.proyec.libreria.entity.CategoriasProductos;
import java.util.List;

public interface CategoriasProductosService {
    CategoriasProductos saveCategoria(CategoriasProductos categoria);
    CategoriasProductos updateCategoria(CategoriasProductos categoria, Long id);
    CategoriasProductos getCategoriaById(Long id);
    void deleteCategoria(Long id);
    List<CategoriasProductos> getAllCategorias();
}

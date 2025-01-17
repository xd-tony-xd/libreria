package com.proyec.libreria.service.impl;


import com.proyec.libreria.Repository.CategoriaProductoRepository;
import com.proyec.libreria.entity.CategoriaProducto;
import com.proyec.libreria.service.CategoriaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaProductoServiceImpl implements CategoriaProductoService {

    @Autowired
    private CategoriaProductoRepository categoriaProductoRepository;

    @Override
    public List<CategoriaProducto> getAllCategorias() {
        return categoriaProductoRepository.findAll();
    }

    @Override
    public CategoriaProducto getCategoriaById(Integer id) {
        Optional<CategoriaProducto> categoria = categoriaProductoRepository.findById(id);
        return categoria.orElse(null);
    }

    @Override
    public CategoriaProducto createCategoria(CategoriaProducto categoria) {
        return categoriaProductoRepository.save(categoria);
    }

    @Override
    public CategoriaProducto updateCategoria(Integer id, CategoriaProducto categoria) {
        if (categoriaProductoRepository.existsById(id)) {
            categoria.setIdCategoria(id);
            return categoriaProductoRepository.save(categoria);
        }
        return null;
    }

    @Override
    public void deleteCategoria(Integer id) {
        categoriaProductoRepository.deleteById(id);
    }
}

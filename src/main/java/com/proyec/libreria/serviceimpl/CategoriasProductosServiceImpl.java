package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.CategoriasProductos;
import com.proyec.libreria.repository.CategoriasProductosRepository;
import com.proyec.libreria.service.CategoriasProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasProductosServiceImpl implements CategoriasProductosService {

    @Autowired
    private CategoriasProductosRepository categoriasProductosRepository;

    @Override
    public CategoriasProductos saveCategoria(CategoriasProductos categoria) {
        return categoriasProductosRepository.save(categoria);
    }

    @Override
    public CategoriasProductos updateCategoria(CategoriasProductos categoria, Long id) {
        if (categoriasProductosRepository.existsById(id)) {
            categoria.setId_categoria(id);
            return categoriasProductosRepository.save(categoria);
        }
        return null;
    }

    @Override
    public CategoriasProductos getCategoriaById(Long id) {
        return categoriasProductosRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCategoria(Long id) {
        categoriasProductosRepository.deleteById(id);
    }

    @Override
    public List<CategoriasProductos> getAllCategorias() {
        return categoriasProductosRepository.findAll();
    }
}

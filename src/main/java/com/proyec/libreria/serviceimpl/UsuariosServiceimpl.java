package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.Usuarios;
import com.proyec.libreria.service.UsuariosService;
import com.proyec.libreria.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceimpl implements UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios saveUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public Usuarios updateUsuario(Usuarios usuario, Long id) {
        if (usuariosRepository.existsById(id)) {
            usuario.setId_usuario(id);
            return usuariosRepository.save(usuario);
        }
        return null; // o puedes lanzar una excepción si no existe el usuario
    }

    @Override
    public Usuarios getUsuarioById(Long id) {
        return usuariosRepository.findById(id).orElse(null); // Retorna null si no existe
    }

    @Override
    public void deleteUsuario(Long id) {
        usuariosRepository.deleteById(id);
    }
}

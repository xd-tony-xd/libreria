package com.proyec.libreria.service;

import com.proyec.libreria.entity.Usuarios;

public interface UsuariosService {
	// Método para guardar un nuevo usuario
    Usuarios saveUsuario(Usuarios usuario);

    // Método para actualizar un usuario existente
    Usuarios updateUsuario(Usuarios usuario, Long id);

    // Método para obtener un usuario por su id
    Usuarios getUsuarioById(Long id);

    // Método para eliminar un usuario por su id
    void deleteUsuario(Long id);

}

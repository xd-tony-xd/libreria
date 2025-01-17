package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Usuarios;
import com.proyec.libreria.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    //http://localhost:8080/api/usuarios
    /*{
  "nombre": "Juan Pérez",
  "correo": "juan.perez@example.com",
  "contraseña": "password123",
  "rol": "admin"
}*/
    // Crear un nuevo usuario
    @PostMapping
    public ResponseEntity<Usuarios> createUsuario(@RequestBody Usuarios usuario) {
        Usuarios nuevoUsuario = usuariosService.saveUsuario(usuario);
        return ResponseEntity.ok(nuevoUsuario);
    }

    //http://localhost:8080/api/usuarios/1
    /*{
  "nombre": "Juan Pérez",
  "correo": "juan.perez@nuevoemail.com",
  "contraseña": "newpassword123",
  "rol": "user"
}
*/
    // Actualizar un usuario existente
    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> updateUsuario(@PathVariable Long id, @RequestBody Usuarios usuario) {
        Usuarios usuarioActualizado = usuariosService.updateUsuario(usuario, id);
        if (usuarioActualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarioActualizado);
    }
   // http://localhost:8080/api/usuarios/1
    // Obtener un usuario por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getUsuarioById(@PathVariable Long id) {
        Usuarios usuario = usuariosService.getUsuarioById(id);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }
//http://localhost:8080/api/usuarios/2
    // Eliminar un usuario por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuariosService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }
}

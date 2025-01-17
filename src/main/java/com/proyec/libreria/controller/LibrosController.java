package com.proyec.libreria.controller;

import com.proyec.libreria.entity.Libros;
import com.proyec.libreria.service.LibrosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/libreria")
public class LibrosController {

	/*use libreria;
	INSERT INTO usuarios (nombre, correo, contraseña, rol) 
	VALUES ('Juan Pérez', 'usuario1@correo.com', 'contraseñaSegura123', 'Administrador');
	INSERT INTO productosgenerales (nombreproducto, precio, stock, id_venta) 
	VALUES ('Producto General 1', 150.75, 20, 1);
	INSERT INTO ventas (idfactura, idproducto, cantidad, precio_unitario, total_venta, id_factura) 
	VALUES (1, 1, 2, 150.00, 300.00, 1);
	INSERT INTO productosgenerales (nombreproducto, precio, stock, id_venta) 
	VALUES ('Producto General 1', 100.00, 50, 1);
	INSERT INTO proveedores (nombre_proveedor, telefono, correoproveedor, direccion, id_producto)
	VALUES ('Proveedor 1', '123456789', 'proveedor1@correo.com', 'Calle Falsa 123', 2);
	INSERT INTO categoriasproductos (NOMBRECATEGORIA, DESCRIPCION, id_producto)
	VALUES ('Tecnología', 'Categoría relacionada con libros de tecnología', 2);
	INSERT INTO libros (TITULO, AUTOR, PRECIOLibro, STOCKLIBRO, id_producto)
	VALUES ('Introducción a la Programación', 'Juan Pérez', 25.99, 100, 2);
*/

    @Autowired
    private LibrosService librosService;

    //http://localhost:8080/v1/libreria/libros
    // Obtener todos los libros
    @GetMapping("/libros")
    public List<Libros> findAllLibros() {
        return librosService.getAllLibros();
    }

    //http://localhost:8080/v1/libreria/libros/create
    /*{
  "titulo": "El gran libro",
  "autor": "Autor Ejemplo",
  "preciolibro": 19.99,
  "stocklibro": 100,
  "libros": {
    "id_producto": 2
  }
}
*/
    // Crear un nuevo libro
    @PostMapping("/libros/create")
    public Long createLibro(@RequestBody Libros libro) {
        return librosService.saveLibro(libro).getId_libro();
    }

    // Actualizar un libro existente
    @PutMapping("/libros/{idLibro}")
    public Libros updateLibro(@PathVariable Long idLibro, @RequestBody Libros libro) {
        return librosService.updateLibro(libro, idLibro);
    }

    //http://localhost:8080/v1/libreria/libros/delete/4
    // Eliminar un libro por ID
    @DeleteMapping("/libros/delete/{idLibro}")
    public void deleteLibro(@PathVariable Long idLibro) {
        librosService.deleteLibro(idLibro);
    }

    // Obtener un libro por ID
    @GetMapping("/libros/{idLibro}")
    public Libros getLibroById(@PathVariable Long idLibro) {
        return librosService.getLibroById(idLibro);
    }
}

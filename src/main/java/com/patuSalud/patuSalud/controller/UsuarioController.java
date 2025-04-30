package com.patuSalud.patuSalud.controller;


import com.patuSalud.patuSalud.model.Usuario;
import com.patuSalud.patuSalud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Obtener todos los usuarios
    @GetMapping("/usuarios/traer")
    public List<Usuario> obtenerTodosUsuarios(){
        return usuarioService.obtenerTodosUsuarios();
    }

    // Agregar un nuevo usuario
    @PostMapping("/usuarios/agregar")
    public String agregarUsuario(@RequestBody Usuario usuarioNuevo) {
        usuarioService.agregarUsuario(usuarioNuevo);
        return "Usuario agregado exitosamente";
    }

    // Actualizar un usuario existente
    @PutMapping("/usuario/actualizar")
    public String actualizarUsuario(@RequestBody Usuario usuarioActualizado) {
        usuarioService.actualizarUsuario(usuarioActualizado);
        return "Usuario actualizado exitosamente";
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/usuario/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
        return "Usuario eliminado exitosamente";
    }

    // Buscar un usuario por ID
    @GetMapping("/usuari/buscar/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id) {
        return usuarioService.buscarUsuarioId(id);
    }
}
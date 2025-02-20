package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Usuario;

import java.util.List;

public interface IUsuarioService {


 public List <Usuario> obtenerTodosUsuarios();

 public void agregarUsuario(Usuario usuarioNuevo);

 public void actualizarUsuario(Usuario usuarioActualizado);

 public void eliminarUsuario(Long id);

 public Usuario buscarUsuarioId (Long id);
}

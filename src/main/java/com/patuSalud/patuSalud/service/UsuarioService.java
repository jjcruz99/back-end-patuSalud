package com.patuSalud.patuSalud.service;


import com.patuSalud.patuSalud.model.Usuario;
import com.patuSalud.patuSalud.repository.IusuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    ///inyeccion de dependencia
    @Autowired
    private IusuarioRepository usuarioRepository;


    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void agregarUsuario(Usuario usuarioNuevo) {
      usuarioRepository.save(usuarioNuevo);
    }

    @Override
    public void actualizarUsuario(Usuario usuarioActualizado) {
        Usuario usuarioExistente = usuarioRepository.findById(usuarioActualizado.getId_usuario()).orElse(null);
            if(usuarioExistente != null){
                usuarioExistente.setNombre(usuarioExistente.getNombre());
                usuarioExistente.setApellido(usuarioExistente.getApellido());
                usuarioExistente.setCelular(usuarioExistente.getCelular());
                usuarioExistente.setCiudad(usuarioExistente.getCiudad());
                usuarioExistente.setObservacion(usuarioExistente.getObservacion());
                usuarioExistente.setCorreo(usuarioExistente.getCorreo());
                usuarioExistente.setDireccion(usuarioExistente.getDireccion());
                usuarioExistente.setIdentificacion(usuarioExistente.getIdentificacion());

                usuarioRepository.save(usuarioExistente);
            }
            else {
                System.out.println("Usuario no encontrado");
            }
    }

    @Override
    public void eliminarUsuario(Long id) {
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        }
       else {
            System.out.println("Usuario no encontrado verifique Id");
        }
    }

    @Override
    public Usuario buscarUsuarioId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}

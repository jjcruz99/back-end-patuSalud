package com.patuSalud.patuSalud.service;


import com.patuSalud.patuSalud.model.Usuario;
import com.patuSalud.patuSalud.repository.IusuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    ///inyeccion de dependencia
    @Autowired
    private IusuarioRepository usuarioRepository;

    @Override
    public void addUsuario(Usuario usuarioNuevo) {
        usuarioRepository.save(usuarioNuevo);
    }
}

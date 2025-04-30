package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Psicologo;
import com.patuSalud.patuSalud.repository.IpsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PsicologoService implements IpsicologoService  {

    ///inyeccion de dependencia

    @Autowired
    private IpsicologoRepository psicologoRepository;

    @Override
    public List<Psicologo> getPsicologo() {
        List<Psicologo> listaPsicologos = psicologoRepository.findAll();
        return listaPsicologos;
    }

    ///Metdo para obtener psicologoo por id
    @Override
    public Psicologo buscarPsicologoId(Long id) {
        return psicologoRepository.findById(id).orElse(null);
    }

    ///Metdo para crear psicologo
    @Override
    public Psicologo crearPsicologo(Psicologo psicologo) {
        return psicologoRepository.save(psicologo);
    }

    ///Metdo para actualizar información

    @Override
    public void actualizarPsicologo(Long id, Psicologo psicologoActualizado) {
        Psicologo existePsicologo = psicologoRepository.findById(id).orElse(null);
        if (existePsicologo != null) {
             existePsicologo.setNombre(psicologoActualizado.getNombre());
             existePsicologo.setApellido(psicologoActualizado.getApellido());
             existePsicologo.setCelular(psicologoActualizado.getCelular());
             existePsicologo.setCiudad(psicologoActualizado.getCiudad());
             existePsicologo.setIdentificacion(psicologoActualizado.getIdentificacion());
             existePsicologo.setCorreo(psicologoActualizado.getCorreo());
             existePsicologo.setObservacion(psicologoActualizado.getObservacion());
             psicologoRepository.save(existePsicologo);
        }else{
            System.out.println("No existe psicologo con ese Id");
        }

    }
    ///Metdo para eliminar psicologo
    @Override
    public void eliminarPsicologo(Long id) {
        psicologoRepository.deleteById(id);
    }
}












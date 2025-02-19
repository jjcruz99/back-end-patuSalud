package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Psicologo;
import com.patuSalud.patuSalud.repository.IpsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PsicologoService implements IpsicologoService  {

    ///inyeccion de dependencia

    @Autowired
    private IpsicologoRepository psicologoRepository;

    ///Metdo para obtener psicologoo por id
    @Override
    public Optional<Psicologo> obtenerPsicologoPorId(Long id) {
        return psicologoRepository.findById(id);
    }

    ///Metdo para crear psicologo
    @Override
    public Psicologo crearPsicologo(Psicologo psicologo) {
        return psicologoRepository.save(psicologo);
    }

    ///Metdo para actualizar información

    @Override
    public Psicologo actualizarPsicologo(Long id, Psicologo psicologoActualizado) {
        if (psicologoRepository.existsById(id)) {
            psicologoActualizado.setId_psicologo(id);
            return psicologoRepository.save(psicologoActualizado);
        }
        return null; // O lanza una excepción
    }
    ///Metdo para eliminar psicologo
    @Override
    public void eliminarPsicologo(Long id) {
        psicologoRepository.deleteById(id);
    }
}












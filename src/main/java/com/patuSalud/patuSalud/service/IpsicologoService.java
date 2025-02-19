package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Psicologo;
import java.util.Optional;


public interface IpsicologoService {

    Optional<Psicologo> obtenerPsicologoPorId(Long id);

    Psicologo crearPsicologo(Psicologo psicologo);

    Psicologo actualizarPsicologo(Long id, Psicologo psicologoActualizado);

    void eliminarPsicologo(Long id);
}

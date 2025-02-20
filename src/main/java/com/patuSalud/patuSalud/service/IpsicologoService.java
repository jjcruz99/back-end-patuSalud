package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Psicologo;

import java.util.List;
import java.util.Optional;


public interface IpsicologoService {

    public Psicologo buscarPsicologoId(Long id);
    // Mostrar todos los productos
    public List<Psicologo> getPsicologo();

    Psicologo crearPsicologo(Psicologo psicologo);

    void actualizarPsicologo(Long id, Psicologo psicologoActualizado);

    void eliminarPsicologo(Long id);
}

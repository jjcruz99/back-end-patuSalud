package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.repository.IpsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsicologoService {

    ///inyeccion de dependencia
    @Autowired
    private IpsicologoRepository psicologoRepository;
}

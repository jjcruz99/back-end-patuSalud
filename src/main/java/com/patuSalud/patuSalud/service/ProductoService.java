package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.repository.IproductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

     ///inyeccion de dependencia
     @Autowired
    private IproductoRepository productoRepository;
}

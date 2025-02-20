package com.patuSalud.patuSalud.controller;

import com.patuSalud.patuSalud.model.Psicologo;
import com.patuSalud.patuSalud.service.IpsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/Psicologo")
public class PsicologoController {

    @Autowired
    private IpsicologoService psicologoServ;

    //crear psicologo
    @PostMapping("/crearPsicologo")
    public String crearPsicologo(@RequestBody Psicologo psicologo){
        psicologoServ.crearPsicologo(psicologo);
        return "El psicologo fue creado con exito";
    }
    //Mostrar todo
    @GetMapping("/getPsicologo")
    public List<Psicologo>getPsicologo(){
        return psicologoServ.getPsicologo();
    }

    ///Metdo para obtener psicologoo por id
    //Enpoint
    @GetMapping("/buscarId/{id}")
    public Psicologo buscarPsicologoId(@PathVariable Long id){
        return psicologoServ.buscarPsicologoId(id);
    }

    ///Metodo para actualizar información
    @PutMapping ("/actualizarPsicologo/{id}")
    public ResponseEntity<String> UpdateProduct(
            @PathVariable Long id,
            @RequestBody Psicologo psicologoActualizado){
        psicologoServ.actualizarPsicologo(id, psicologoActualizado);
        return ResponseEntity.ok("Se actualizó correctamente");
    }

    ///Metodo para eliminar psicologo
    @DeleteMapping ("/eliminarPsicologo/{id}")
    public String eliminarPsicologo(@PathVariable Long id){
        psicologoServ.eliminarPsicologo(id);
        return "El Psicologo se elimino con exito";
    }

}

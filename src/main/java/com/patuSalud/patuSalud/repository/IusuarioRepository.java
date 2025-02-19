package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IusuarioRepository  extends JpaRepository<Usuario,Long> {

}

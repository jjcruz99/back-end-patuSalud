package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Psicologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpsicologoRepository extends JpaRepository<Psicologo,Long> {
}

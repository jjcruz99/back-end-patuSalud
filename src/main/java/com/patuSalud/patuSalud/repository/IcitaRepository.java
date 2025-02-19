package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcitaRepository extends JpaRepository<Cita,Long> {
}

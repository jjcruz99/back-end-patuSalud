package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Estado_cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iestado_citaRepository extends JpaRepository<Estado_cita,Long> {
}

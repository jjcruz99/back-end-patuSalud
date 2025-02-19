package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Agenda_citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iagenda_citaRepository extends JpaRepository<Agenda_citas,Long> {
}

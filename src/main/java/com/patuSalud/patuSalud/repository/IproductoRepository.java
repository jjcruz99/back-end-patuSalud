package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproductoRepository extends JpaRepository<Producto,Long> {
}

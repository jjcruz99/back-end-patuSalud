package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpedidoRepository extends JpaRepository<Pedido,Long> {
}

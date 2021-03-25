package com.yuritrier.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuritrier.entites.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}

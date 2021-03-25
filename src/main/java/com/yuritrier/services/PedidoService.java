package com.yuritrier.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuritrier.entites.Pedido;
import com.yuritrier.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> findAll() {
		return repository.findAll();
	}
	
	public Pedido findById(UUID id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.get();
	}
	
	public Pedido insert(Pedido obj) {
		return repository.save(obj);
	}
	
}

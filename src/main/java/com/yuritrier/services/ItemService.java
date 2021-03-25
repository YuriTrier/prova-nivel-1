package com.yuritrier.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuritrier.entites.Item;
import com.yuritrier.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repository;
	
	public List<Item> findAll() {
		return repository.findAll();
	}
	
	public Item findById(UUID id) {
		Optional<Item> obj = repository.findById(id);
		return obj.get();
	}
	
}

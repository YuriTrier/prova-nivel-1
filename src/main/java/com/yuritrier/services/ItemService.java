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
	
	public Item insert(Item obj) {
		return repository.save(obj);
	}
	
	public void delete(UUID id) {
		repository.deleteById(id);
	}
	
	public Item update(UUID id, Item obj) {
		Item entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Item entity, Item obj) {
		entity.setDescricao(obj.getDescricao());
		entity.setPreco(obj.getPreco());
		entity.setTipoItem(obj.getTipoItem());	
	}
	
}

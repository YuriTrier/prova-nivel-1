package com.yuritrier.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuritrier.entites.Item;

@RestController
@RequestMapping(value = "/itens")
public class ItemResource {

	@GetMapping
	public ResponseEntity<Item> findAll() {
		Item i = new Item(1L, "Monitor", 1250.00, 1);
		return ResponseEntity.ok().body(i);
	}
	
	
}

package com.yuritrier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuritrier.entites.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}

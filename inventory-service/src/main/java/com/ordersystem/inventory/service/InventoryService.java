package com.ordersystem.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersystem.inventory.repository.InventoryRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	
	
	private final InventoryRepository repo;

	@Transactional
	public boolean isInStock(String skuCode, Integer quantity) {
		return repo.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
	}

}

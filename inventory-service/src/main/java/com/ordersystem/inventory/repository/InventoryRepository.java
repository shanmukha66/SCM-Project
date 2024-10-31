package com.ordersystem.inventory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ordersystem.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
	
	
}

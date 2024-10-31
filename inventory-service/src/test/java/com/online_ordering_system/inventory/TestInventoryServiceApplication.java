package com.online_ordering_system.inventory;

import org.springframework.boot.SpringApplication;

import com.ordersystem.inventory.InventoryServiceApplication;

public class TestInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

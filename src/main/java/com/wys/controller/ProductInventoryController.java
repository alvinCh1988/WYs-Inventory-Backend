package com.wys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wys.model.ProductInventory;
import com.wys.service.ProductInventoryService;

@RestController
public class ProductInventoryController {
	
	@Autowired
	private ProductInventoryService inverntoryService;
	
	@PostMapping("/postInventoryType")
	public ProductInventory postType(
			@RequestBody ProductInventory inventoryType) {
		return inverntoryService.save(inventoryType);
	}

}

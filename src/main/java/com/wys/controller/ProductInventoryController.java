package com.wys.controller;

import java.util.List;
import java.util.Map;

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
	
	@PostMapping("/addInventoryType")
	public String addInventoryType(
			@RequestBody List<ProductInventory> inventoryType) throws Exception {
		
		System.out.println("API: addInventoryType ==> GET REQUEST!");

		return inverntoryService.insertInventory(inventoryType);
	}

}

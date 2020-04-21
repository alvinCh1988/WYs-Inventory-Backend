package com.wys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wys.model.InventoryType;
import com.wys.service.InventoryTypeService;

@RestController
public class InventoryTypeController {
	
	@Autowired
	private InventoryTypeService inverntoryService;
	
	@PostMapping("/postInventoryType")
	public InventoryType postType(
			@RequestBody InventoryType inventoryType) {
		return inverntoryService.save(inventoryType);
	}

}

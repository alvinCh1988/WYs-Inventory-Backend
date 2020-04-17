package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.repository.InventoryTypeRepository;

@Service()
public class InventoryTypeService {
	
	@Autowired
	private InventoryTypeRepository inventoryTypeRepository;

}

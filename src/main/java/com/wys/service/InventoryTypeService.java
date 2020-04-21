package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.model.InventoryType;
import com.wys.repository.InventoryTypeRepository;

@Service()
public class InventoryTypeService {
	
	@Autowired
	private InventoryTypeRepository inventoryTypeRepository;
	
	/**
	 * 新增庫存狀態
	 * @param inventoryType
	 * @return
	 */
	public InventoryType save(InventoryType inventoryType) {
		return inventoryTypeRepository.save(inventoryType);
	}

}

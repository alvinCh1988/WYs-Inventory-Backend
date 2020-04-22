package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.model.ProductInventory;
import com.wys.repository.ProductInventoryRepository;

@Service()
public class ProductInventoryService {
	
	@Autowired
	private ProductInventoryRepository inventoryTypeRepository;
	
	/**
	 * 新增庫存狀態
	 * @param inventoryType
	 * @return
	 */
	public ProductInventory save(ProductInventory inventoryType) {
		return inventoryTypeRepository.save(inventoryType);
	}

}

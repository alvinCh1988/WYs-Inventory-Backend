package com.wys.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.model.Location;
import com.wys.model.ProductAssign;
import com.wys.model.ProductInventory;
import com.wys.repository.LocationRepository;
import com.wys.repository.ProductAssignRepository;
import com.wys.repository.ProductInventoryRepository;

@Service()
public class ProductInventoryService{

	@Autowired
	private ProductInventoryRepository inventoryTypeRepository;

	@Autowired
	private ProductAssignRepository productAssignRepository;

	@Autowired
	private LocationRepository locationRepository;

	/**
	 * 新增庫存狀態
	 * 
	 * @param inventoryType
	 * @return
	 */
	public String insertInventory(ProductInventory inventory) throws Exception {
		
		insertLoaction(inventoryTypeRepository.save(inventory));

		return "SUCCESS";
	}

	public String insertInventory(List<ProductInventory> inventory) throws Exception {
		
		for(ProductInventory pi : inventory) {
			
			insertLoaction(inventoryTypeRepository.save(pi));

		}
		return "SUCCESS";
	}

	/**
	 * 新增
	 * 
	 * @param typeId
	 * @return
	 */
	public void insertLoaction(ProductInventory inventoryResult) throws Exception {
		
		if (inventoryResult != null) {
			Integer typeId = inventoryResult.getTypeId();
			List<Location> location = locationRepository.findAll();

			for (Location lo : location) {
				ProductAssign productAssign = new ProductAssign();
				productAssign.setTypeId(typeId);
				productAssign.setLocation(lo.getLocationId());
				productAssign.setQuantity(0);

				productAssignRepository.save(productAssign);
			}
		}
	}
}

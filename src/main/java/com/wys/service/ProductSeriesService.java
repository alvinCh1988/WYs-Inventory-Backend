package com.wys.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.repository.ProductSeriesRepository;

@Service()
public class ProductSeriesService {

	@Autowired
	private ProductSeriesRepository productSeriesRepository;

	public List<Object> getInventoryTree() {

		List<Object> list = new ArrayList<Object>();

		String lastItme = null;
		List<Object> storageLocList = new ArrayList<Object>();
		Map<String, Object> inventoryTypeMap = new HashMap<String, Object>();

		String lastSeries = null;
		List<Object> prodList = new ArrayList<Object>();
		Map<String, Object> seriesMap = new HashMap<String, Object>();

		List<Object[]> treeData = productSeriesRepository.getInventoryTree();
		for (Object[] o : treeData) {

			String newSeries = o[0].toString();
			if (!newSeries.equals(lastSeries)) {
				if (lastSeries != null) {
					seriesMap.put("products", prodList);
					list.add(seriesMap);
					prodList = new ArrayList<Object>();
				}
				seriesMap = new HashMap<String, Object>();
				seriesMap.put("series", o[0].toString());
			}
			lastSeries = o[0].toString();

			
			String newItem = o[1].toString();
			if (!newItem.equals(lastItme)) {
				if (lastItme != null) {
					inventoryTypeMap.put("storageLoc", storageLocList);
					prodList.add(inventoryTypeMap);
					storageLocList = new ArrayList<Object>();
				}
				inventoryTypeMap = new HashMap<String, Object>();
				inventoryTypeMap.put("item", o[1].toString());
				inventoryTypeMap.put("inventory", o[2].toString());
				inventoryTypeMap.put("unassigned", o[3].toString());
			}
			lastItme = o[1].toString();

			Map<String, String> assignMap = new HashMap<>();
			assignMap.put("loc", o[4].toString());
			assignMap.put("quantity", o[5].toString());
			assignMap.put("update", o[6].toString());
			storageLocList.add(assignMap);

		}

		return list;
	}

}

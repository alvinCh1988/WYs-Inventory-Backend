package com.wys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wys.model.Location;
import com.wys.model.ProductSeries;
import com.wys.service.ProductSeriesService;

@RestController
public class ProductSeriesController {

	@Autowired
	private ProductSeriesService productSeriesService;

	
	@GetMapping("/tree")
	public List<Object> getProductSeries() {
		return productSeriesService.getInventoryTree();
	}
	
	@PostMapping("/addSeries")
	public ProductSeries addSeries(
			@RequestBody ProductSeries productSeries) {
		return productSeriesService.save(productSeries);
	}


}

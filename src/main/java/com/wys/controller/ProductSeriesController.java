package com.wys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wys.model.ProductSeries;
import com.wys.service.ProductSeriesService;

@RestController
public class ProductSeriesController {

	@Autowired
	private ProductSeriesService productSeriesService;

	@GetMapping("/hello")
	public String getHello() {
		System.out.println("test!");
		return "Hello World ~!!";
	}

	@GetMapping("/tree")
	public List<Object> getProductSeries() {
		return productSeriesService.getInventoryTree();
	}
	
	@PostMapping("/postSeries")
	public ProductSeries postSeries(
			@RequestBody ProductSeries productSeries) {
		return productSeriesService.save(productSeries);
	}


}

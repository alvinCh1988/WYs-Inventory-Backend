package com.wys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

	public List<ProductSeries> getProductSeries() {

		return null;
	}

}

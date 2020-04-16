package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.repository.ProductSeriesRepository;

@Service()
public class ProductSeriesService {
	
	@Autowired
	private ProductSeriesRepository productSeriesRepository;

}

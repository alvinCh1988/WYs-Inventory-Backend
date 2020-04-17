package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.repository.ProductAssignRepository;

@Service()
public class ProductAssignService {
	
	@Autowired
	private ProductAssignRepository productAssignRepository;

}

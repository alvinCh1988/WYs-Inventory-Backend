package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.repository.PurchaseDetailRepository;

@Service()
public class PurchaseDetailService {
	
	@Autowired
	private PurchaseDetailRepository purchaseDetailRepository;

}

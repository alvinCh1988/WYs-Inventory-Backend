package com.wys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wys.model.ProductSeries;
import com.wys.model.PurchaseDetail;
import com.wys.repository.PurchaseDetailRepository;

@Service()
public class PurchaseDetailService {
	
	@Autowired
	private PurchaseDetailRepository purchaseDetailRepository;

	public PurchaseDetail save(PurchaseDetail purchase) {
		return purchaseDetailRepository.save(purchase);
	}

}

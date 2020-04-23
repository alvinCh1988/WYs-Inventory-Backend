package com.wys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wys.model.PurchaseDetail;
import com.wys.service.PurchaseDetailService;

@RestController
public class PurchaseDetailController {
	
	@Autowired
	private PurchaseDetailService purchaseDetailService;
	
	@PostMapping("/addPurchaseRecord")
	public PurchaseDetail addPurchaseRecord(@RequestBody PurchaseDetail purchase) {
		return purchaseDetailService.save(purchase);
	}

}

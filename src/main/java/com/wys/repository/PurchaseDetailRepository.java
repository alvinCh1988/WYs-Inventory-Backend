package com.wys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wys.model.PurchaseDetail;


public interface PurchaseDetailRepository extends JpaRepository<PurchaseDetail, Integer> {

}

package com.wys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wys.model.ProductInventory;


public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Integer> {

}

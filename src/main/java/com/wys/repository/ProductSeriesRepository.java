package com.wys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wys.model.ProductSeries;


public interface ProductSeriesRepository extends JpaRepository<ProductSeries, Integer> {
	
	@Query(
//			nativeQuery = true, 
			value = "SELECT A.seriesName, B.productName, B.inventory, B.unassigned, D.locationName, C.quantity, C.modifyDate \n" +
            "FROM ProductSeries A, ProductInventory B, ProductAssign C, Location D \n" +
            "WHERE 1=1 \n" +
            "AND A.seriesId = B.seriesId \n" +
            "AND B.typeId = C.typeId \n" +
            "AND C.locationId = D.locationId \n"+
            "ORDER BY A.seriesId ASC")
    public List<Object[]> getInventoryTree();

}

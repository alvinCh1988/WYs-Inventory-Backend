package com.wys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wys.model.ProductSeries;


public interface ProductSeriesRepository extends JpaRepository<ProductSeries, Integer> {
	
	@Query(nativeQuery = true, 
			value = "SELECT A.series_name, B.product_name, B.inventory, B.unassigned, C.location, C.quantity, C.modify_date \n" +
            "FROM test_db.product_series A, test_db.inventory_type B, test_db.product_assign C \n" +
            "WHERE 1=1 \n" +
            "AND A.series_id = B.series_id \n" +
            "AND B.type_id = C.type_id \n" +
            "ORDER BY A.series_id")
    public List<Object[]> getInventoryTree();

}

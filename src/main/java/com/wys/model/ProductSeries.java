package com.wys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 產品系列
 * @author Alvin
 *
 */
@Entity
@Table(name = "product_series")
public class ProductSeries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "series_id", length = 6)
	private Integer seriesId;
	
	@Column(name = "series_name", length = 15)
	private String seriesName;
	
	@Column(name = "series_color", length = 15, nullable = true)
	private String seriesColor;
          
    @Column(name = "orders", length = 3, nullable = true)
    private Integer orders;

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSeriesColor() {
		return seriesColor;
	}

	public void setSeriesColor(String seriesColor) {
		this.seriesColor = seriesColor;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	
	

}

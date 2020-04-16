package com.wys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_series")
public class ProductSeries {
	
	@Id
    @Column(name = "series_id")
	private int seriesId;
	
	@Column(name = "series_name")
	private String seriesName;
	
	@Column(name = "series_color")
	private String seriesColor;
          
    @Column(name = "orders")
    private Integer orders;

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
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

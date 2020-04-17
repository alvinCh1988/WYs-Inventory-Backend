package com.wys.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 庫存狀態
 * @author Alvin
 *
 */
@Entity
@Table(name = "inventory_type")
public class InventoryType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id", length = 6)
	private Integer typeId;
	
    @Column(name = "series_id", length = 3)
	private Integer seriesId;
	
	@Column(name = "productName", length = 15)
	private String productName;
	
	@Column(name = "icon", length = 15, nullable = true)
	private String icon;
	
	@Column(name = "pic_src", length = 15, nullable = true)
	private String pic_src;
	
	@Column(name = "inventory", length = 3)
	private Integer inventory;
	
	@Column(name = "unassigned", length = 3)
	private Integer unassigned;
	
    @Column(name = "orders", length = 3)
    private Integer orders;
	
	@Column(name = "modify_date",insertable=false, updatable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp modifyDate;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPic_src() {
		return pic_src;
	}

	public void setPic_src(String pic_src) {
		this.pic_src = pic_src;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public Integer getUnassigned() {
		return unassigned;
	}

	public void setUnassigned(Integer unassigned) {
		this.unassigned = unassigned;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

}

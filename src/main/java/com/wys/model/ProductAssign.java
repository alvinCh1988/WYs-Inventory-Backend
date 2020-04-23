package com.wys.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

/**
 * 產品分配
 * @author Alvin
 *
 */
@Entity
@Table(name = "product_assign")
public class ProductAssign {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "assign_id", length = 6)
	private Integer assignId;
	
	@Column(name = "type_id", length = 3)
	private Integer typeId;
	
	@Column(name = "location_id", length = 3)
	private Integer locationId;
	
	@Column(name = "quantity", length = 3)
	private Integer quantity;
	
	@Column(name = "modify_date",insertable=false, updatable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	private Date modifyDate;

	public Integer getAssignId() {
		return assignId;
	}

	public void setAssignId(Integer assignId) {
		this.assignId = assignId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getLocation() {
		return locationId;
	}

	public void setLocation(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}

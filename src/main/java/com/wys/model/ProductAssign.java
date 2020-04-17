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
	
	@Column(name = "location", length = 15)
	private String location;
	
	@Column(name = "quantity", length = 3)
	private Integer quantity;
	
	@Column(name = "modify_date",insertable=false, updatable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp modifyDate;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

}

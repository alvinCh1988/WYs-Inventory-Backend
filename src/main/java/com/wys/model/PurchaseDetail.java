package com.wys.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 進貨明細
 * @author Alvin
 *
 */
@Entity
@Table(name = "purchase_detail")
public class PurchaseDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purchas_id", length = 6)
	private Integer purchaseId;
	
	@Column(name = "type_id", length = 3)
	private Integer typeId;
	
	// 採購日期
	@Column(name = "purchase_date", length = 20)
	private String purchaseDate;
	
	// 數量
	@Column(name = "quantity", length = 3)
	private Integer quantity;
	
	// 價格
	@Column(name = "amount", length = 5)
	private Integer amount;
	
	@Column(name = "remark", nullable = true)
	private String remark;

	
	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}

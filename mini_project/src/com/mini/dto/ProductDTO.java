package com.mini.dto;

import java.util.Date;

public class ProductDTO {

	private String no;
	private String name;
	private String category;
	private int price;
	private int count;
	private Date registDate;
	private Date deliverDate;
	private String memNo;
	private String purchaseNo;
	private String cusId;
	
	public ProductDTO() {}

	public ProductDTO(String no, String name, String category, int price, int count, Date registDate, Date deliverDate,
			String memNo, String purchaseNo, String cusId) {
		super();
		this.no = no;
		this.name = name;
		this.category = category;
		this.price = price;
		this.count = count;
		this.registDate = registDate;
		this.deliverDate = deliverDate;
		this.memNo = memNo;
		this.purchaseNo = purchaseNo;
		this.cusId = cusId;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	public String getMemNo() {
		return memNo;
	}

	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}

	public String getPurchaseNo() {
		return purchaseNo;
	}

	public void setPurchaseNo(String purchaseNo) {
		this.purchaseNo = purchaseNo;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	@Override
	public String toString() {
		return "ProductDTO [no=" + no + ", name=" + name + ", category=" + category + ", price=" + price + ", count="
				+ count + ", registDate=" + registDate + ", deliverDate=" + deliverDate + ", memNo=" + memNo
				+ ", purchaseNo=" + purchaseNo + ", cusId=" + cusId + "]";
	}

	
	
	
	

}

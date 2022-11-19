package com.mini.dto;

import java.util.Date;

public class ProductDTO {

	String no;
	String name;
	String category;
	int price;
	int count;
	Date registDate;
	String memNo;
	
	public ProductDTO() {}
	
	public ProductDTO(String no, String name, String category, int price, int count, Date registDate, String memNo) {
		super();
		this.no = no;
		this.name = name;
		this.category = category;
		this.price = price;
		this.count = count;
		this.registDate = registDate;
		this.memNo = memNo;
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

	public String getMemNo() {
		return memNo;
	}

	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}

	@Override
	public String toString() {
		return "ProductDTO [no=" + no
				+ ", name=" + name
				+ ", category=" + category
				+ ", price=" + price
				+ ", count=" + count
				+ ", registDate=" + registDate
				+ ", memNo=" + memNo + "]";
	}
	
	

}

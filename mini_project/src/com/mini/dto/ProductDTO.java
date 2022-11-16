package com.mini.dto;

public class ProductDTO {

	int price;
	String name;
	String category;
	double discount;
	boolean isFree;
	boolean isCoupon;
	int numProduct;
	
	public void inquiry() {
		
		System.out.println(this.toString());
	}
	
	public ProductDTO() {}
	
	
	public ProductDTO(int price, String name, String category, double discount) {
		super();
		this.price = price;
		this.name = name;
		this.category = category;
		this.discount = discount;
	}


	public ProductDTO(int price, String name, String category, double discount, boolean isFree, boolean isCoupon,
			int numProduct) {
		super();
		this.price = price;
		this.name = name;
		this.category = category;
		this.discount = discount;
		this.isFree = isFree;
		this.isCoupon = isCoupon;
		this.numProduct = numProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "상품 : ** price : " + price 
				+ ", name : " + name 
				+ ", category : " + category 
				+ ", discount :" + discount
				+ "**";
	}
	
	
	
	

}

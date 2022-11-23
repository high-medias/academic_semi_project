package com.mini.dto;

public class ProductAndMemberDTO {

	String proNo;
	String category;
	String name;
	int count;
	int price;
	String memNo;
	String memberName;
	MemberDTO memberDTO;
	
	
	public ProductAndMemberDTO() {
		super();
	}


	@Override
	public String toString() {
		return "ProductAndMemberDTO [proNo=" + proNo
				+ ", name=" + name
				+ ", count=" + count
				+ ", price=" + price
				+ "]";
	}


	
	
	
	
}

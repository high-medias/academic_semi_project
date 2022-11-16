package com.mini.dto;

import java.util.ArrayList;

public class MemberDTO {

	private String id;
	private String name;
	private String address;
	private char gender;
	private int cMount;
	private int age;
	
	private ArrayList<ProductDTO> pList = new ArrayList<ProductDTO>(); // 구매 내역
	private ArrayList<ProductDTO> bList = new ArrayList<ProductDTO>(); // 장바구니 내역
	
	public MemberDTO() {
	
	}

	public MemberDTO(String id, String name, int age, String address, char gender, int cMount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.cMount = cMount;
	}
	
	public MemberDTO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public int getcMount() {
		return cMount;
	}

	public void setcMount(int cMount) {
		this.cMount = cMount;
	}
	
	public void getInfo() {
		
		System.out.print("id : " + id + ", name : " + name + ", age : "  + age + 
				          ", address : " + address + ", gender : " + gender);
	}

	public ArrayList<ProductDTO> getpList() {
		return pList;
	}

	public void addpList(ProductDTO product) {
		this.pList.add(product);
	}

	public ArrayList<ProductDTO> getbList() {
		return bList;
	}

	public void addbList(ProductDTO product) {
		this.bList.add(product);
	}
	
	
	
}

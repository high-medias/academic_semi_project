package com.mini.dto;

import java.util.Date;

public class EventDTO {
	
	private String eventProductName;
	private double eventDiscount;
	private Date evntStPer = new Date(); // 시작 기간
	private Date evntEnPer = new Date(2022-1900, 11, 25, 23, 59, 59); // 종료 기간
	private int price; // 상품 가격
	
	public EventDTO() {
		
	}

	public EventDTO(String eventProductName, double eventDiscount, Date evntStPer, Date evntEnPer, int price) {
		super();
		this.eventProductName = eventProductName;
		this.eventDiscount = eventDiscount;
		this.evntStPer = evntStPer;
		this.evntEnPer = evntEnPer;
	}

	public String getEventProductName() {
		return eventProductName;
	}

	public void setEventProductName(String eventProductName) {
		this.eventProductName = eventProductName;
	}

	public double getEventDiscount() {
		return eventDiscount;
	}

	public void setEventDiscount(double eventDiscount) {
		this.eventDiscount = eventDiscount;
	}

	public Date getEvntStPer() {
		return evntStPer;
	}

	public void setEvntStPer(Date evntStPer) {
		this.evntStPer = evntStPer;
	}

	public Date getEvntEnPer() {
		return evntEnPer;
	}

	public void setEvntEnPer(Date evntEnPer) {
		this.evntEnPer = evntEnPer;
	}
	
	public double getDiscount() {
		// 상품 할인 가격 구하기
		return price - (eventDiscount / 100 * price);
	}

	public void eventInfo() {
		System.out.println("Event [이벤트 상품 이름=" + eventProductName 
				+ ", 이벤트 할인율=" + eventDiscount 
				+ ", 이벤트 시작 기간=" + evntStPer 
				+ ", 이벤트 종료 기간=" + evntEnPer);
	}	
	
}

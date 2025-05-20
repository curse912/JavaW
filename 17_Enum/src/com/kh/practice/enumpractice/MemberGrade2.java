package com.kh.practice.enumpractice;

import java.util.Arrays;

public enum MemberGrade2 {
	BASIC(5,"BASIC"){
		@Override
		public void getDiscountInfo() {
			System.out.println(name() + "등급 할인율 : " + getDiscount()+"5");	
		}
	},
	SILVER(10,"SILVER"){
		@Override
		public void getDiscountInfo() {
			System.out.println(name() + "등급 할인율 : " + getDiscount()+"10");	
	},
	GOLD(20,"GOLD"){
		@Override
		public void getDiscountInfo() {
			System.out.println(name() + "등급 할인율 : " + getDiscount()+"20");	
	},
	VIP(30,"VIP"){
			@Override
			public void getDiscountInfo() {
				System.out.println(name() + "등급 할인율 : " + getDiscount()+"30");	
	};
	
	private int discount;
	private String grade;
	
	public private MemberGrade2 (int discount, String grade) {
		this.discount = discount;
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	public int getDiscount() {
		return discount;
	}
	public MemberGrade2 valueOfGrade(String grade) {
		// neme() : 현재 상수값의 변수명을 문자열로 반환해주는 함수
		return Arrays.stream(values())
			.filter(mg -> mg.name().equals(grade))	//mg.grade.equals(grade)
			.findAny()
			.orElseThrow(()->	new RuntimeException("일치하는 grade가 없습니다."));
	}
	public abstract void getDiscountInfo() {
	
	}
		
	}

}

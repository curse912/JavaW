package com.kh.practice.enumpractice;

import java.util.Arrays;

public enum MemberGrade {
	BASIC("BASIC"){
		//자동완성 : Ctrl + spacebar
		@Override
		public void printTest() {
			
		}
	},	
	SILVER("SILVER"){
		@Override
		public void printTest() {
			
		}
	},
	GOLD("GOLD"){
		@Override
		public void printTest() {
			
		}
	},
	VIP("VIP"){
		@Override
		public void printTest() {
			
		}
	};
	
	private String grade;
	
	private MemberGrade(String grade) {	
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public static MemberGrade valueOfGrade(String grade) {
		return Arrays
				.stream(values())
				.filter(_enum -> _enum.grade == grade)
				.findFirst()
				.orElseThrow(() -> new RuntimeException());
	}
	public String getDiscountInfo() {
		switch(this.name()) {
		case "BASIC" : return "BASIC 등급 할인율 : 5%";
		case "SILVER" : return "BASIC 등급 할인율 : 5%";
		case "GOLD" : return "BASIC 등급 할인율 : 5%";
		case "VIP" : return "VIP 등급 할인율 : 30%";
		default : return "찾을 수 없음";
		}
	}
	

	public abstract void printTest();
	

}

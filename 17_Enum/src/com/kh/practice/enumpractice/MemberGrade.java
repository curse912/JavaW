package com.kh.practice.enumpractice;

import java.util.Arrays;

public enum MemberGrade {
	BASIC(0){
		//자동완성 : Ctrl + spacebar
		@Override
		public void printTest() {
			System.out.println("검은색 입니다.");
			
		}
	},	
	SILVER(1){
		@Override
		public void printTest() {
			System.out.println("빨간색 입니다.");
		}
	},
	GOLD(2){
		@Override
		public void printTest() {
			System.out.println("하얀색 입니다.");
		}
	},
	VIP(3){
		@Override
		public void printTest() {
			System.out.println("vip 입니다.");
		}
	};
	
	private int grade;
	
	private MemberGrade(int grade) {	
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public static MemberGrade valueOfGrade(int grade) {
		return Arrays.stream(values())
			  .filter(_enum -> _enum.grade == grade)
			  .findFirst()
			  .orElseThrow(() -> new RuntimeException());
	}
	
	
	public abstract void printTest();
	

}

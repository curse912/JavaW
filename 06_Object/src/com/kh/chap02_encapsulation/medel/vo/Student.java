package com.kh.chap02_encapsulation.medel.vo;

public class Student {
	//필드 == 멤버변수 == 인스턴스변수 == 속성
	private String name;
	private int age;
	private double height;
	
	//메서드부
	// 각 객체의 기능을 구현
	//[표현법]
	// 접근 제한자 반환형 메소드명(매개변수) {
	//실행할 코드
	
	/*
	public void study() {
		System.out.println (name+"이 공부합니다.");
		//this.name default이기때문에 생략하능 ==>name
	}
	


	//setter/getter 매서드 구현
	public void setName(String name);{
		this.name = name;
	}
	public void setAge(int age) {
		this.getAge = age;
	}
	*/
	public void setHeight(double heigt) {
		this.height = height;
	}
	
	//hetter메소드
	//객체 내부의 필드 값을 반환해주는 메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	//모든 필드값을 하나의 문자열로 합쳐서 반환하는 메서드
	public String information() {
		return name+"님의 나이는"+age+"살이고, 키는 "+height+"cm입니다.";
		}	
}
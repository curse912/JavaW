package com.kh.chap01_abstraction.model.vo;

public class Student {	// 학생 관리 프로그램
	// 인적사항 검토기능
	
	// 속성(student라는 객체가 가지는 속성)
	// [필드부]:속성을 나열
	public String name;
	public int age;
	public double height;
	
	// 생성자
	// [생성자부] : 생략가능
	
	// 기능
	// [매서드부]
	public void study() {
		System.out.println("공부를 합니다");
	}
	public void fight(Student s) { //매개변수 (Student s)
		String str = this.name + "학생과 " + s.name +"학생이 싸웁니다.";
		System.out.println(str);
		
	}
	

}

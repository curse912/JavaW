package com.kh.chap03_field.model.vo;

public class FieldTest1 {
	/*
	 * 변수 구분
	 * - 전역변수 : 클래스 영역 바로 아래에 선언하는 변수들
	 * 			  클래스 어디서든 사용가능
	 * - 지역변수 : 클래스 영역 내에서 특정 영역({})에 선언한 변수
	 * 			  선언한 지역에서만 사용가능( 메서드,if,.... )
	 * 1. 전역 변수
	 * 	- 필드 == 인스턴스 변수 == 멤버 변수
	 *	  생성시점 : 객체가 메모리에 할당되면 함께 생성.
	 *	  소멸시점 : 객체가 소멸 할 때 함께 소멸
	 * 
	 * 	- 클래스 변수 == static 변수
	 * 	 생성시점 : 프로그램 시작과 동시에 static영역에 에모리 할당
	 * 	 소명시점 : 프로그램 종료시
	 * 
	 * 2. 지역변수
	 * 	  생성시점 : 특정영역({})이 실행될 때 할당
	 *	  소멸시점 : 특정 구역이 종료될 때 소멸 
	 * */
	private int global;	//heat에 선언되면 jvm이 자동으로 default값을 선언해줌 
	public void test (int num) {
		
		int local = 0;
		
		if (true) {
			int a = 0;
		}	
		//test메서드를 사용하기위해, FieldTest1객체를 생성하게
		//되면 global필드에는 항상 값이 초기화된다(JVM)
		System.out.println(global);	//jvm이 defualt 값 선언
		System.out.println(local);	//int local;이면 초기화가 안되어있어 사용불가
		System.out.println(num);
		//if 영역 내에있으므로 a선언 불가
		//System.out.println(a);	
		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.df);
		System.out.println(ft2.pro);
		System.out.println(ft2.pub);
	}

}

package com.kh.chap05_method.sontroller;

public class OverloadTest {
	/* 
	 * 메서드 오버로딩(메서드 추가적재)
	 * 	- 한 클래스 내에 "같은 이름의 메서드를 여러개" 정의할 수 있는 방법
	 * 	- 매개변수의 자료형, 매개변수의 개수 및 순서를 다르게 작성해줘야한다.
	 * 	- 그 외, 매개변수의 이름, 접근제한자, 반환혀응은 다르더라도 메서드 오버로딩에 영향을 주지 않는다. 
	 * 
	 * 순서가 다르면 다른 메서드
	 * (int a, double b) != (double b, int a)
	 */
	public void test() {
		// 메서드 오버로딩이 뭐였지..? System.out.println();
		//System.out.println(); 
		//오버로딩이 잘된케이스 println안에 int,double,등... 가능함
		
		
	}
	public void test(int a) {}
	public void test(int a, String s) {}
	public void test(String s,int a) {}
	public void test(String s) {}
	//오버로딩이 잘된케이스
	
	/*
	//에러발생 케이스들
	public void test(String s1) {}	//매개변수의 이름이 달라도 같은 자료형임
	
	//반환형은 메서드 오버로딩과 관련없음.
	public String test(String s) {
		return "zz";
	}
	
	//접근 제한자는 오버로딩과 관련없음.
	public void test (String s) {}
	*/
	//자료형을 다르게//
//	드래그 cntrl+/ ==>전체 주석
//	필드 객체 초기
//	멤버변수/인스턴스 = 메모리내에존재
}

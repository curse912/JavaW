package com.kh.chap03_wrapper.run;

public class Run {
	/*
	 * Wrapper 클래스
	 * 	-> 기본 자료형을 객체롤 포장해주는 클래스
	 * 	-> 기본 자료형을 객체로 만들어서, 필요한 메서드를 호출 할 수 있다.
	 * 
	 *  기본 자료형 <----------------> Wrapper 클래스
	 *   boolean                     Boolean
	 *   char                        Character
	 *   byte                        Byte
	 *   short                       Short
	 *   int                         Integer
	 *   long                        Long
	 *   float                       Float
	 *   double                      Double
	 * */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2);
		//System.out.println(num1.eqauls(num2));
		
	}

}

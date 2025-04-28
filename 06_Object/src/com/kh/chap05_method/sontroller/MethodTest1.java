package com.kh.chap05_method.sontroller;

public class MethodTest1 {
	
	/*
	 * 메서드 작성법
	 * 접근제한자 [예약어(static/final)] 반황형 메서드명 ([매개변수]){
	 * 	수행할 코드들
	 * 	[return 반환값;]	//반황형이 void인 경우 생략 가능
	 * }
	 */
	
	// 1. 반환형 x, 매개변수 x
	public void method1() {
		System.out.println("매개변수와 반환형이 없는 매서드");
		
		//return;	//JVM이 자동으로 생성해주기 때문에 생략 가능.
	}
	
	// 2. 반환형 O, 매개변수 x
	public int method2() {
		System.out.println("매개변수는 없고 반환형은 있는 매서드");;
		
		return 33333;
	}
	
	//3. 반환형 x, 매개변수 o
	public void method3( int num1, int num2) {
		System.out.println("매개변수는 있고, 반환형은 없는 매서드");
		
		//num1과 num2중 더 큰 값, 작은 값을 출력하는 메서드
		int min = num1;
		int max = num2;
		
		if(num1>num2) {
			max = num1;
			min = num2;
		}
		 System.out.println("최소값 :" + min + "최대값 : "+ max);
		
	}
	
	//4.매개변수도 있고 반환 값도 있는 매서드
	public int method4(int a,int b) {
		System.out.println("매개변수도 있고, 반환형도 있는 매서드");
		return a * b;
	} 

}

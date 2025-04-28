package com.kh.chap05_method.run;

import com.kh.chap05_method.sontroller.MethodTest2;

public class Run {
	public static void main(String[] args) {
		//MethodTest2 mt2 = new MethodTest2();
		//mt2.method(0);	//스태틱메서드 호출을 위해서, 객체생성은 불필요
		///메모리 낭비임...아래랑 같음
		
		//클래스명.메서드명
		MethodTest2.method(0);
		Math.random();
		
	}
	
}

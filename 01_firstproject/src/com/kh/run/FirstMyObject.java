package com.kh.run;
//package + class명 == 풀 클래스명

import java.util.Date;//날짜를 표시해주는 클래스
//외부 클래스를 사용하기위해서는 import 사용

public class FirstMyObject {
	
	//자바는 실행하기 위해서 반드시 main 메서드가 존재해야 한다.
	public static void main(String[] args) {
		System.out.println("안녕");
		
		//외부 클래스를 이용하여 현재 날짜를 출력
		System.out.println(new Date());
	}

}

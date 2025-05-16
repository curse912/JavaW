package com.kh.chap01_innerClass.part04_anonymous;

public class OuterClass4 {
	/*
	 * 익명 내부 클래스
	 * 	- 이름이 없는 내부 클래스
	 * 	- 지역 내부클래스에서 불필요해보이는 코드를 없애고, 간결화 시킨 방법
	 * */
	
	public Runnable getRunnable() {
		// class선언 x
		// class선언 (매서드 작성영역) + 객체생성을 합쳐서 표현
		// 람다식 이전에 자주사용
		return new Runnable() {
			private int num = 1;
			// Runnable 인터페이스의 추상메서드를 구현하는 영역
			public void run() {
				System.out.println("쓰레드 실행중....");
			}
			
		};
	}

}

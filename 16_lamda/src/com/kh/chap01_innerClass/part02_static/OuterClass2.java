package com.kh.chap01_innerClass.part02_static;

public class OuterClass2 {
	private String str = " 필드";
	private static String staticStr = "정적필드";
	
	/*
	 * 정적(static) 내부 클래스가
	 * 	- 외부클래스가 로드되는 시점에서 정적 내부클래스도 함꼐 static영역으로 저장공간을 할당받는다.
	 * 	- 외부클래스와 종속적이지 않다.
	 * 	- 하나의 클래스파일에 다양한 클래스를 설계할때 사용한다.(DTO)
	 * 	- 외부클래스와 무관하게 다른클래스에서도 이용항 외부클래스는 정적 외부클래스로 사용한다.(Builder)
	 * 
	 * 
	 * */
	public static class staticInnerClass{	//OutterClass2.staticInnerClass => 외부클래스명.내부클래스  형식으로 사용
		int num = 100;
		static int num2 = 100;
		
		public void test() {
//			System.out.println(str);	//사용불가
			System.out.println(staticStr);
			System.out.println(num);
			System.out.println(num2);
		}
		public static void sTest() {
			//생성주기가 매우 중요함
//			System.out.println(str);	//사용불가
			System.out.println(staticStr);
//			System.out.println(num);	//사용불가
			System.out.println(num2);
		}
	}
	

}

package com.kh.chap01_innerClass.part01_instance;

public class OuterClass { //외부클래스 접근제한자는 : public, default 둘중하나만 가능
	
	//필드 = 멤버변수 = 인스턴스변수
	private String str = "외부클래스 필드";	
	private static String staticStr = "외부클래스 스태틱 필드";	//static -> 정적변수
	private InnerClass inner;
	
	public OuterClass() {
		inner = new InnerClass();
	}
	
	
	/*
	 * 인스턴스 내부클래스
	 * 	- 외부 클래스에서만 생성하여 사용하는 객체를 선언할때 보통사용
	 * 	- 외부 클래스의 보조적인 역할의 클래스를 정의한다.
	 * 	- ex) HashMap 내부의 Node(Entry), keySet, EnterySet. 컬렉션클래스들의 보조적인 역할을 하는 클래스들
	 * 	- 인스턴스 내부 클래스들은 반드시 "외부 클래스"에 의해 생성된다.
	 * */
	/* public */private class InnerClass{	// 접근제한자 : public private
		//인스턴스 클래스 : outer클래스에 독립적인 클래스이므로 보통 접근제한자를 private, default만 사용한다.
		
		//필드부
		private int num = 100;
		static int sNum = 100;
		//정적변수(static)를 자주 사용하지 않는다.	--> 접근하려면 InnerClass매서드의 접근제한자를 public으로 바꿔야 하기때문
		
		private void privateMethod() {
			System.out.println(num);
			System.out.println(str);
			System.out.println(staticStr);	//정적변수
			System.out.println(sNum);
			
		}
		
	}
	
	public void method() {
		// 외부필드 선언을통해 num을 불러올수 있음 => inner.num
		inner.privateMethod();
	}

}

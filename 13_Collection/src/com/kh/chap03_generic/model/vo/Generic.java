package com.kh.chap03_generic.model.vo;

// 현재 클래스에서 사용할 타입변수를 <타입변수>
public class Generic <T,G> {	// class레벨 제네릭 
	//보통 한글자씀 & 여러개 지정 가능
	
	/*
	 * 제네릭 설정방법
	 * 	- 여러 참조 자료형으로 대체 될 수 있는 부분을 하나의 문자로 표현한다.
	 * 		<T> , <G> , <V> ...
	 * 	- <> : 다이아몬드연산자는 참조자료형을 얻어 올 수 있는 연산자
	 * 	- 제네릭은 class, method에 각각 지정할 수 있다.
	 * */
	T t;
	G g;
	
	public T getT() {	//반환형에 가능
		return t;
	}
	
	public void setT( T t ) {
		this.t = t;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}
	
	//반환형 함수명 매개변수
	public T test(G g) {
		return t;
	}
	
	// 메서드레벨 제네릭 설정
	public <V> void printTest(V item) {	//예약어 사이에 <>사용하여 지정가능
		System.out.println(item);
	}
	
	
}

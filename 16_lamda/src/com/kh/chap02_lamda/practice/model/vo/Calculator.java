package com.kh.chap02_lamda.practice.model.vo;

@FunctionalInterface
public interface Calculator<V> {
	//자료형을 두개 써야되는데 매서드 2개로 표현하면 안되므로
	// 타입으로 타입(변수 V)으로 표현

	 V operate(V v1, V v2); 
	 //자료형 문자와 정수 --> 제네릭으로 정의함 -->복합이므로 타입으로 지정
	

}

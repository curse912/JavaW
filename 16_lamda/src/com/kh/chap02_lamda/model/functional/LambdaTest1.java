package com.kh.chap02_lamda.model.functional;

//함수형 인터페이스가 맞는지 검사해줌
// 함수형 인터페이스로 사용되는 인터페이스는 
// 내부적으로 추상메서드가 딱 하나만 있다.
@FunctionalInterface
public interface LambdaTest1 {
	
	int add(int x, int y);
	//void print();	-> 	함수형 인터페이스에는 매서드가 2개 있을 수는 없다.

}

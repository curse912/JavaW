package com.kh.chap02_lamda.practice;

import com.kh.chap02_lamda.practice.model.vo.MyFunction2;

public class Practice4 {
	public static void main(String[] args) {
		MyFunction2<String, Integer> printer = (name, score) -> System.out.println(name + "님의 점수는 " + score + "점입니다.");
		
		printer.accept("홍길동", 95);
		printer.accept("이순신", 88);

		}
//	interface MyFunction2 {	
//
//	void accept(K k, A a);
//	}
	

}

package com.kh.chap02_lamda.practice;

import com.kh.chap02_lamda.practice.model.vo.MyFunction;

public class Practice3 {
	public static void main(String[] args) {
		MyFunction <Integer, String> intToString = i -> "Value: " + i;
		MyFunction <String, Integer> strToLength = s -> s.length();
		System.out.println(intToString.apply(42)); // Value: 42
		System.out.println(strToLength.apply("lambda")); // 6
	}
	

}

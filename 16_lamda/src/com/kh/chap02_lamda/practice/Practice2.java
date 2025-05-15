package com.kh.chap02_lamda.practice;

import com.kh.chap02_lamda.practice.model.vo.Calculator;

public class Practice2 {
	public static void main(String[] args){
		Calculator<Integer> adder = (a, b) -> a + b;
		Calculator<String> combiner = (a, b) -> a + "-" + b;
		System.out.println(adder.operate(10, 20)); // 30
		System.out.println(combiner.operate("hello", "world")); // hello-world
	}


}

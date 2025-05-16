package com.kh.chap02_lamda.practice;

import java.util.Objects;
import java.util.function.BiFunction;

import javax.management.RuntimeErrorException;

public class Practice5 {
	public static void main(String[] args){
		BiFunction<Integer, Integer, Integer>
			op = getOperator("+");
		 	System.out.println(op.apply(10, 5)); // 15
		 	op = getOperator("*");
		 	System.out.println(op.apply(10, 5)); // 50
		 	op = getOperator("-");
		 	System.out.println(op.apply(10, 5)); // 5
		 	op = getOperator("/");
		 	System.out.println(op.apply(10, 5)); // 2
		 	op = getOperator("%");
		 	System.out.println(op.apply(10, 5)); // 0
		}
		public static BiFunction<Integer, Integer, Integer> getOperator(String type) {
		 //코드 구현
			 Objects.requireNonNull(type);
		        return (Integer x, Integer y) -> {
		        	switch(type) {
		        	case "+" : return x + y;
		        	case "*" : return x * y;
		        	case "-" : return x - y;
		        	case "/" : return x / y;
		        	case "%" : return x % y;
		        	default : return null;
		        	}
		        	
		        };
//		        switch(type) {
//		        	case "+" : return (x, y) -> x + y;
//		        	case "*" : return (x, y) -> x * y;
//		        	case "-" : return (x, y) -> x - y;
//		        	case "/" : return (x, y) -> x / y;
//		        	case "%" : return (x, y) -> x % y;
//		        	default : throw new RuntimeException("잘못된 연산자입니다.");
//	        	}
		}


}

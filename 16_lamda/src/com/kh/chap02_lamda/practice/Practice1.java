package com.kh.chap02_lamda.practice;

import com.kh.chap02_lamda.practice.model.vo.StringChecker;

public class Practice1 {
	public static void main(String[] args){
		String[] arr = {"java", "lambda", "hi", "functional", "wow"};
		printStrings(arr, s -> s.length() >= 5);
	}
		
	public static void printStrings(String[] arr, StringChecker checker) {
		 for (String str : arr) {
			 if (checker.check(str)) {
				 System.out.println(str);
			 }
		 }
	}
	
	//여기에 적어도됨
//	interface StringChecker {
//		
//		boolean check(String s);
//		
//
//	}



}

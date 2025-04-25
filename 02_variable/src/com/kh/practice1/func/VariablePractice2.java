package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int iNum1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int iNum2 = sc.nextInt();
		
		/*
		int iSum = iNum1 + iNum2;
		int iSub = iNum1 - iNum2;
		int iMul = iNum1 * iNum2;
		int iDiv = iNum1 / iNum2;
		
		System.out.printf(" 더하기 결과 : %d\n", iSum);
		System.out.printf(" 빼기 결과 : %d\n", iSub);
		System.out.printf(" 곱하기 결과 : %d\n", iMul);
		System.out.printf(" 나누기 몫 결과 : %d", iDiv);
		*/
		
		System.out.println(" 더하기 결과 : "+ iNum1 + iNum2);
		System.out.println(" 빼기 결과 : "+(iNum1 - iNum2));
		System.out.println(" 곱하기 결과 : "+iNum1 * iNum2);
		System.out.println(" 나누기 몫 결과 : "+ iNum1/ iNum2);
		
		
		
		
		
	}

}

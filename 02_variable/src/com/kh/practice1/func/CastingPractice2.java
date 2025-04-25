package com.kh.practice1.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void casting2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int)(korean + english + math);
		int avg = total/3;
		
		System.out.printf("총점 : %d\n평균 : %d",total , avg);
		
		}

}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double round = 2*(width + height);
		double area = width * height;
		
		System.out.printf("면적 : %.2f \n둘레 : %.1f",area, round);
		
		/*
		 * System.out.println("면적 : "+ width * height);
		 * System.out.println("둘레 : "+ (width + height) * 2);
		 * 
		 * */
		
	}

}

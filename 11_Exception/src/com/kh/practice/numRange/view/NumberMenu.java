package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("정수1 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("정수2 : ");
		double num2 = sc.nextDouble();
		
		try {
			boolean result = nc.checkDouble(num1, num2);
			System.out.printf("%.0f은(는) %.0f의 배수인가? %b",num1,num2,result);
			
		}catch(NumRangeException e){
			e.printStackTrace();
		}
	}

}

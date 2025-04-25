package com.kh.practice1.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void casting() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자 : ");
	char text1 = sc.nextLine().charAt(0);
	int uni1 = text1;
	System.out.println("A unicode : "+uni1);
	
	System.out.print("문자 : ");
	char text2 = sc.nextLine().charAt(0);
	int uni2 = text2;
	System.out.println("a unicode : "+uni2);
	

	}
}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		char text1 = str.charAt(0);
		char text2 = str.charAt(1);
		char text3 = str.charAt(2);
		
		
		System.out.printf("첫 번째 문자 : %c\n두 번째 문자 : %c\n세 번째 문자 : %c",text1 ,text2, text3 );
		
		/*System.out.printf("첫 번째 문자 : " +str.chrAt(0) );
		 *System.out.printf("두 번째 문자 : " +str.chrAt(1) );
		 *System.out.printf("세 번째 문자 : " +str.chrAt(2) ); 
		 * */
	}

}

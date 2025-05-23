package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	 Scanner sc = new Scanner(System.in); //이렇게 해도 가능
	//전역변수
	
	public void practice1() {
		//지역변수
		//지역변수과 전역변수가 같을때 지역변수가 이김
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candys = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+candys / people);
		System.out.println("남는 사탕 개수 : "+candys % people);
		
		
		
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int C = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();	//버퍼비워주기
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		//int ch1 = (int)gender;
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		Double point  = sc.nextDouble();
		
		String result = gender == 'M' ? "남학생" : "여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade , C, number, name, result, point);
		
		
	
		/*
		if (gender == 'M') {
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.",grade , C, number, name, point);
			
		}else {
		System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다.",grade , C, number, name, point);
		}
		*/
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : age >= 20 ? "성인" : "청소년";
		System.out.println
		(result);
		/*
		if( age<=13 ) {
			System.out.print("어린이");
		}else if ( 13 < age && age <= 19 ) {
			System.out.print("청소년");
		}else {
			System.out.print("성인");
		}
		*/
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 국어 : ");
		int kor = sc.nextInt();
		
		System.out.print(" 영어 : ");
		int eng = sc.nextInt();
		
		System.out.print(" 수학 : ");
		int math = sc.nextInt();
		
		int sum =  kor + eng + math;
		double avr = sum/3;
		
		System.out.printf(" 합계 : %d\n 평균 : %.1f\n",sum,avr);
		
		boolean result = kor>=40 && eng>=40 && math>=40 && avr>=60;		
		System.out.print(result ? " 합격 " : " 불합격 " );
		
		
		//String result = (avr >= 60 ? " 합격 " : " 불합격 ");
		/*
		if( avr >= 60) {
			
			System.out.println(" 합격 ");
			
		}else {
			System.out.println(" 불합격 ");
		}
		*/
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 (- 포함) : ");
		String Num = sc.nextLine();
		//123456-123456
		//0123456789...
		
		char gender = Num.charAt(7); //'1' ==> 49 아스키코드
		String result = gender%2 == 0 ? "여자" : "남자";
		//String gender = ch == '1' || ch == '3' ? "남자" : "여자" ;
		
		System.out.println(result);
		
	}
	
	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		boolean result = input <= num1 || input > num2;
		
		System.out.println(result);
		
	}
	public void practice7() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		
		System.out.println(result);
		
		
	}
	public void practice8() {
		
		System.out.print("A사원의 연봉 : ");
		int payA = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int payB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int payC = sc.nextInt();
		
		String stA = payA*1.4 >= 3000 ? "3000 이상" : "3000 미만";
		String stB = payB*1 >= 3000 ? "3000 이상" : "3000 미만";
		String stC = payC*1.15 >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.printf("\nA사원 연봉/연봉+a : %d/%.1f\n%s", payA, payA*1.4 , stA);
		System.out.printf("\nB사원 연봉/연봉+a : %d/%.1f\n%s", payB, payB*1.0 , stB);
		System.out.printf("\nC사원 연봉/연봉+a : %d/%.1f\n%s", payC, payC*1.15 , stC);
		
	}

}

package com.kh.practice.chap01;

import java.util.Scanner;

//import com.kh.variable.D_Printf;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n");
		
		System.out.print("메뉴번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.print("입력");
			break;
		case 2 : 
			System.out.print("수정");
			break;
		case 3 : 
			System.out.print("조회");
			break;
		case 4 : 
			System.out.print("삭제");
			break;
		default : 
			System.out.print("종료");
		}
		System.out.println("메뉴입니다.");
		
		
	}
	public void practice2() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		
		/*요즘 트렌드 else를 안쓰는 if문
		if( !(num > 0) ) {
			System.out.println("양수가 아니다");
			return;
		if(num%2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		 */
		
		if( !(num > 0) ) {		// [ num <= 0 ] == [ !( num > 0 ) ]
			System.out.println("양수가 아니다");
		}else if( num%2 == 1 ) {
			System.out.println("홀수다");
		} else /*if( num%2 == 0 )*/ {
			System.out.println("짝수다");
		}
	}
	
	public void practice3() {
		
		System.out.print(" 국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print(" 영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print(" 수학 점수 : ");
		int math = sc.nextInt();
		
		int sum =  kor + eng + math;
		int avr = sum/3;
		
		boolean pass = kor >= 40 && eng >= 40 && math >=40 && avr >= 60;
				
		if(!pass) {
			System.out.println(" 불합격입니다. ");
			return;
		} 
		System.out.printf(" 국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n 평균 : %d\n",kor,eng, math,sum,avr);
		System.out.println(" 축하합니다! 합격입니다. ");
		
		
		
		/*
		 * if( kor >= 40 && eng >= 40 && math >=40 ) { if(avr >= 60) {
		 * 
		 * System.out.printf(" 국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n 평균 : %d\n",kor,eng,
		 * math,sum,avr); System.out.println(" 축하합니다! 합격입니다. ");
		 * 
		 * }
		 * 
		 * }else { System.out.println(" 불합격입니다. "); }
		 */
	}
	public void practice4() {
		
		System.out.print(" 1~12 사이의 정수 입력: ");
		int month = sc.nextInt();
		
		String season = "";
		
		if(1 <= month && month <= 12) {
			switch(month) {
			case 3,4,5 ://case 3 : case 4 : case 5 :
				season = "봄";
				break;
			case 6,7,8 :
				season = "여름";
				break;
			case 9,10,11 :
				season = "가을";
				break;
			case 12,1,2 :
				season = "겨울";
				break;
			default :
				System.out.printf("%d월은 잘못 입력된 달입니다.",month);
				return;
			}
		} 
			System.out.printf("%d월은 %s입니다.",month,season);
			
		
	}
	public void practice5() {
		System.out.print(" 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print(" 비밀번호 : ");
		String pw = sc.nextLine();
		
		/*
		if(!id.equals("myId")) {
			System.out.println("아이디가 틀렸습니다.");
		}else
		*/
		
		if( id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		}else if( id.equals("myId") ) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if( pw.equals("myPassword12") ) {
			System.out.println("아이디가 틀렸습니다.");
		}else System.out.println("존재하지 않는 정보");
			
	}
	
	public void practice6() {
		System.out.print(" 권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자" : 
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
			break;
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default : 
			System.out.println("존재하지 않는 등급입니다.");
		}
	}
	
	public void practice7() {
		System.out.print(" 키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print(" 몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height*height);
		System.out.printf(" BMI지수 : %f\n", BMI);
		
		if( BMI < 18.5) {
			System.out.print(" 저체중 ");
		}else if(BMI < 23 ) {
			System.out.print(" 정상체중 ");
		}else if(BMI < 25 ) {
			System.out.print(" 과체중 ");
		}else if(BMI < 30 ) {
			System.out.print( "비만 ");
		}else
			System.out.print(" 고도비만 ");
		
	}
	
	public void practice8() {
		System.out.print(" 피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print(" 피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print(" 연산자를 입력(+,-,*,/,%) : ");
		char st = sc.nextLine().charAt(0);
		//char ch = sc.nextLine().charAt(0);
		
		sc.nextLine();
		
		if(!(st =='+' || st == '-' || st == '*' || st == '/' || st == '%')) {
			System.out.println("잘못입력했습니다. 프로그램을 종료합니다.");
			return;
		}
		
		System.out.printf(" %d %c %d = ", num1, st, num2);
		
		switch(st) {
		case '+' :
			System.out.printf("%d",(num1+num2));
			break;
		case '-' :
			System.out.printf(" %d", (num1-num2));
			break;
		case '*' :
			System.out.printf("%d",(num1*num2));
			break;
		case '/' :
			System.out.printf("%f",(double)(num1/num2));
			break;
		case '%' :
			System.out.printf("%d",(num1%num2));
			break;
		
		}
		
		/*
		if( num1 < 0 && num2 < 0 ) {
			System.out.print(" 잘못 입력 하셨습니다.");
			
		} else if (st == '+') {
			System.out.printf(" %d %c %d = %d",num1, st, num2, num1 + num2);
			
		} else if (st == '-') {
			System.out.printf(" %d %c %d = %d",num1, st, num2, num1 - num2);
			
		} else if (st == '*') {
			System.out.printf(" %d %c %d = %d",num1, st, num2, num1 * num2);
			
		} else if (st == '/') {
			System.out.printf(" %d %c %d = %f",num1, st, num2, (double )num1 / (double)num2);
			
		} else if (st == '%') {
			System.out.printf("% d %c %d = %d",num1, st, num2, num1 % num2);
		}*/
		
	}
	public void practice9() {
		
		System.out.print(" 중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print(" 기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print(" 과제 점수 : ");
		int rep = sc.nextInt();
		System.out.print(" 출석 횟수 : ");
		int att = sc.nextInt();
		
		double mid_final = mid*0.2;
		double fin_final = fin*0.3;
		double rep_final = rep *0.3;
		double att_point = att *1.0;
		
		double total = mid_final + fin_final + rep_final + att_point;
		
		System.out.println("==========결과==========");
		
		if( att <= 14 ){
			System.out.printf("Fail [출석회수 부족 (%d/20)]",att);
			//System.out.println("Fail [출석회수 부족 (" + att + "/20)]");
			return;	
		}
		
		System.out.println("중간 고사 점수(20) : "+mid_final); 
		System.out.println("기말 고사 점수(30) : "+fin_final);
		System.out.println("과제 점수(30) : "+rep_final);
		System.out.println("출석 점수(20) : "+att_point);
		System.out.println("총점 : "+total);
		
		if (total>=70) {
				System.out.println("Pass");
		}else System.out.println("Fail [점수 미달]");	
		
		/*
		{
		System.out.println("중간 고사 점수(20) : "+mid*0.2);
		System.out.println("기말 고사 점수(30) : "+fin*0.3);
		System.out.println("과제 점수(30) : "+pro*0.3);
		System.out.println("출석 점수(20) : "+att);
		System.out.println("총점 : "+(mid*0.2 + fin*0.3 + pro*0.3 + att));
		System.out.println("Fail [점수 미달]");
		}
		*/
		
	}
	public void practice10() {
		System.out.printf("1. 메뉴출력 \n2. 짝수/홀수 \n3. 합격/불합격 \n4. 계절 \n5. 로그인 \n6. 권환확인 \n7. BMI \n8. 계산기 \n9. P/F\n");
		
		System.out.print("메뉴번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		switch(num) {
		case 1 : 
			System.out.println("(실습문제1 실행)");
			new ControlPractice().practice1();
			break;

		case 2 : 
			System.out.println("(실습문제2 실행)");
			new ControlPractice().practice2();
			break;
			
		case 3 : 
			System.out.println("(실습문제3 실행)");
			new ControlPractice().practice3();
			break;
			
		case 4 : 
			System.out.println("(실습문제4 실행)");
			new ControlPractice().practice4();
			break;
		case 5 : 
			System.out.println("(실습문제5 실행)");
			new ControlPractice().practice5();
			break;

		case 6 : 
			System.out.println("(실습문제6 실행)");
			new ControlPractice().practice6();
			break;
			
		case 7 : 
			System.out.println("(실습문제7 실행)");
			new ControlPractice().practice7();
			break;
			
		case 8 : 
			System.out.println("(실습문제8 실행)");
			new ControlPractice().practice8();
			break;
		case 9 : 
			System.out.println("(실습문제9 실행)");
			new ControlPractice().practice9();			
			break;
			
		default : 
			System.out.println("존재하지 않습니다.");
		}
	}
	public void practice11 () {
		/*
		System.out.print("비밀번호 입력(1000~9999) : ");
		int num = sc.nextInt();
		
		if(!(1000 <= num && num <= 9999)){
			System.out.println("자리수 안맞음");
			return;
		}
		*/
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		String num = sc.nextLine();
		
		char num1 = num.charAt(0);
		char num2 = num.charAt(1);
		char num3 = num.charAt(2);
		char num4 = num.charAt(3);
		//char num5 = num.charAt(4);
		
		/*
		if(!(num5 == 0)) {
			System.out.println(" 자리수 안맞음 ");
			return;
		}*/
		

		if(num.length() != 4) {
			System.out.println(" 자리수 안맞음 ");
			return;
		}
		
		boolean result = num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num3 == num4 ||num2 ==num4 ;
		
		
		if(result) {
			System.out.println(" 중복값있음 ");
		}else System.out.println(" 생성 성공 ");
		//System.out.println(result ? " 중복값있음 " : " 생성 성공 ");
	}
	public void practice11_2 () {
		System.out.println("비밀번호 입력 (1000~9999) : ");
		int pwd = sc.nextInt();
		
		if(!(1000 <= pwd && pwd <= 9999)){
			System.out.println("자리수 안맞음");
			return;
		}
		
		//1234
		int first = pwd /1000;		//1
		int second = pwd /100 % 10;	//12 % 10 =>2
		int third = pwd / 10 % 10;	//123.4 => 123 % 10 => 3
		int fourth = pwd % 10;
		
		//first와 second, third, fourth
		//second와 third, fourth
		//third와 fourth
		if (first == second || first == third || first == fourth || second == third || second == fourth || third == fourth) {
			System.out.println("중복 값 있음");
		}else {
			System.out.println("생성 성공");
		}
		
	}
	

}

package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc =new Scanner(System.in);
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
		for(int i = 0;  i < num; i++) {
			System.out.print(i + " ");
		}
				
	}

	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
		
			int num = sc.nextInt();
		
			if(num <= 0) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				//practice2();
				//return;
				continue;
			}
			for(int i = 0;  i < num; i++) {
				System.out.print(i + " ");
			}
			break;
		}
				
	}
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
		// 1 2 3 4
		// 4 3 2 1
		for(int i = num;  i > 0; i--) {
			System.out.print(i + " ");
		}
				
	}
	
	public void practice4() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
		
			int num = sc.nextInt();
		
			if(num <= 0) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				practice4();
				return;
				//continue;
			}
			for(int i = num;  i > 0; i--) {
				System.out.print(i + " ");
			}
			break;
		}
				
	}
	
	public void practice5() {
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <=num; i++) {
			sum += i;
			System.out.print(i+ (i==num ? " = " : " + "));
			//System.out.print(i + " + ");
		}
		System.out.print(sum);
		//System.out.print("= "+sum);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
			return;
		}
		
		// 4 8
		// 8 4
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i = min; i <=max; i++) {
			System.out.print(i+" ");
		}
		
		/*
		if(num1 <= 0 || num2 <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else if(num1 >num2) {
			for(int i = num2;  i < num1; i++) {
				System.out.print(i + " ");
			}
		}else 
			for(int i = num1;  i < num2; i++) {
			
			System.out.print(i + " ");
		}
		 */
	}
	
	public void practice7() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
			practice7();
			return;
		}
		
		// 4 8
		// 8 4
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i = min; i <=max; i++) {
			System.out.print(i+" ");
			
		}
		
		/*
		 * while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
		
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
		
			if(num1 <= 0 || num2 <= 0) {
				System.out.println("1이상의 숫자를 입력해주세요");
				continue;
			}else if(num1 >num2) {
				for(int i = num2;  i < num1; i++) {
					System.out.print(i + " ");
				}
			}else 
				for(int i = num1;  i < num2; i++) {	
					System.out.print(i + " ");
				}
			break;
		}
		*/
		
	}
	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("==== %d단 ====\n",num);
		
		for(int i = 1; i < 10; i++) {
			System.out.printf(" %d * %d = %d\n",num,i,num*i);
		}
		
	}
	public void practice9() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num > 9) {
			System.out.println("9 이하의 숫자를 입력해주세요");
			return;
		}
		for(; num <=9; num++) {
			System.out.printf("===== %d단 =====\n", num);
			
			for(int j = 1; j<10; j++)
				System.out.printf(" %d * %d = %d\n",num,j,num*j);
		}
		/*
		for(int i = num; i <= 9; i++) {
			System.out.printf("===== %d단 =====\n", i);
			for(int j = 1; j<10; j++)
				System.out.printf(" %d * %d = %d\n",num,j,num*j);
		}*/
		
	}
	public void practice10() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num > 9) {
			System.out.println("9 이하의 숫자를 입력해주세요");
			practice10();
			return;
		}
		for(; num <=9; num++) {
			System.out.printf("===== %d단 =====\n", num);
			
			for(int j = 1; j<10; j++)
				System.out.printf(" %d * %d = %d\n",num,j,num*j);
		}
		/*
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
		
			if(num > 9) {
				System.out.println("9 이하의 숫자를 입력해주세요");
				continue;
			}
			for(int i = num; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j<10; j++)
				System.out.printf(" %d * %d = %d\n",num,j,num*j);
			
			}
			break;
		}*/
	}
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();	//4
		
		System.out.print("공차 : ");
		int a = sc.nextInt();	//3
		
		for(int i = 0; i < 10; i++) {
			System.out.println(num + a*i);
		}
		
		int count = 0;
		for(int i = num; count < 10; num += a) {
			System.out.print(i+" ");
			count++;
		}
		
		/*
		for(int i = num; i < num+(a*10); i += a) {
			System.out.print( i + " ");
		}*/
		
	}
	public void practice12() {
		while(true) {
			System.out.print("연산자(+ - * / %) : ");
			String st = sc.nextLine();
			
			if ( st.equals("exit")) {
				System.out.println(" 프로그램을 종료합니다.");
				continue;
			}
			char ch = st.charAt(0);
			if (!(ch =='/' || ch == '%'|| ch =='*' ||ch == '-' || ch == '+')) {
				System.out.println("없는 연산자 입니다 다시 입력해주세요");
				continue;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			
			if(ch =='/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시입력하시오");
				continue;
			}
			
			switch(ch) {
			case '+' :
				System.out.printf(" %d %c %d = %d",num1,ch,num2,num1+num2);
				break;
			case '-' :
				System.out.printf(" %d %c %d = %d",num1,ch,num2,num1-num2);
				break;
			case '*' :
				System.out.printf(" %d %c %d = %d",num1,ch,num2,num1*num2);
				break;
			case '/' :
				System.out.printf(" %d %c %d = %d",num1,ch,num2,num1/num2);
				break;
			case '%' :
				System.out.printf(" %d %c %d = %d",num1,ch,num2,num1%num2);
				break;
				
			}
			
			/*
			if(!(st.equals("+") || st.equals("-") ||st.equals("*") || st.equals("/") || st.equals("%"))) {
				System.out.println(" 없는 연산자 입니다. 다시 입력해 주세요");
			} else if (st.equals("/") && (num1 == 0 || num2 == 0)) {
				System.out.println(" 0으로 나눌 수 없습니다. 다시 입력해주세요");
			} else {
				System.out.printf(" %d %s %d = ",num1,st,num2);
				switch(st) {
				case "+" :
					System.out.printf("%d",(num1+num2));
					break;
				case "-" :
					System.out.printf(" %d", (num1-num2));
					break;
				case "*" :
					System.out.printf("%d",(num1*num2));
					break;
				case "/" :
					System.out.printf("%.1f",(double)(num1/num2));
					break;
				case "%" :
					System.out.printf("%d",(num1%num2));
					break;
				}
			}*/
			break;
		}
		
	}
	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++)System.out.print("*");
			System.out.println();
		}
	}
	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i>=num; i++) { //가로줄
			for(int j = num; j>=1; j--)System.out.print("*");
			System.out.println();
		}
		/*
		 for(int j = 5; j>0; j--) {
		 	for(int = 0; i<j; i++{
		 		System.out.print("*");
		 	}
		 }
		 */
	}
	
	
}

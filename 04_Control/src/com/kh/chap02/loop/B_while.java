package com.kh.chap02.loop;

public class B_while {
	/*
	 * while문
	 * [표현법]
	 * 
	 * [초기식]	//필수아님
	 * while(조건식) {
	 * 	//반복적으로 실행할 코드.
	 * 	[증감식]	//필수아님.
	 * }
	 * 
	 * */
	public void method1() {
		// for문을 while문으로 변경
		int i = 0;
		while(i < 5) {
			System.out.println("안녕하시오");
			i++;
		}
	}
	public void method2() {
		
		//while문으로 5회 반복하여 아래 코드 출력.
		// 1 2 3 4 5 
		
		int i = 1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		//무한반복 while for(;;)
	}
	public void method3() {
		// 1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		// 출력예시 : 1부터 xxx까지의 총합계 : xxx
		
		int random = (int)(Math.random() * 10 +1);
		System.out.println("1~10 사이의 랜덤값 : "+random);
		
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i++;
		}
		System.out.printf("1부터 %d까지의 총합계 : %d",random,sum);
		
	}
	/*
	 * do-while
	 * [표현법]
	 * do {
	 * 	조건에 맞지 않더라도 무조건 한번은 실행될 수 있는 코드
	 * } while(조건식);
	 * 
	 * do-while문은 별도의 조건검사 없이 최초 한번은 무조건 실행된다.
	 * 
	 * */
	public void method4() {
		
		do {
			System.out.println("하이");
		} while(false);
	}
	public void method5() {
		// 1 2 3 4 5
		int i = 1;
		do {
			System.out.print(i++ + " ");			
		}while(i<=5);
	}
	public void method6() {
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}System.out.println(i + "출력");
		}
	}
	

}

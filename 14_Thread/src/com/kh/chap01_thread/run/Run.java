package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

//Thread 블로그참조

public class Run {
	public static void main(String[] args) {
		/*
		 * 프로그램
		 * 	- 어떤 작업을 실행할 수 있는 파일 (==> 실행하기전 앱)
		 * 	- CPU를 할당 받지 않은 상태
		 * 
		 * 프로세스
		 * 	- 현재 동작하고 있는 프로그램 (==> 실행중인 앱)
		 * 	- 작업을 위해 CPU를 할당받은 상태
		 * 
		 * 스레드
		 * 	- 한 개의 프로세스 내에서 실제 작업을 수행하는 소단위
		 * 	- 모든 프로세스에는 반드시 1개 이상의 스레드가 존재한다.
		 * 	- 스레드는 메인스레드 1개와 n개의 일반 스레드가 존재한다.
		 * 
		 * 1개 ==> 싱글스레드
		 * 	- 메인스레드 1개 가지고 작업을 처리
		 * 	- 한 작업식 차례대로 처리한다.
		 * 	> 스택메모리에 쌓인대로 메서드를 실행하는 형태
		 * 
		 * n개 ==> 멀티스레드
		 * 	- 메인스레드 외 추가적인 스레드를 이용하여 동시에 여러작업을 처리한다.
		 * 	
		 * 싱글코어, 멀티코어 다름
		 * 멀티코어) A와B를 동시에 처리
		 * 			처리시간 : 싱글스레드 >>> 멀티스레드
		 * 싱글코어) A와B를 조금씩 번갈아가면서 처리	
		 * 		   처리시간 : 싱클스레드 =< 멀티스레드( 잦은 전환으로 딜레이) (같거나 살짝크다)  
		 * 
		 * 멀티 스레드의 장점
		 * 	1) 작업효율성 증대
		 * 		- A스레드 B스레드 나눠서 작업을 시킴으로써 더 빠르게 작업 완료가 가능하다.
		 * 	2) 응답성 향상
		 * 		- 사용자 입장에서 일처리가 빠르게 보이낟.
		 * 	3) CPU를 효율적으로 사용가능
		 * 		- 싱글스레드 기준, 작업 완료시까지 CPU가 대기해야하는 상황이 생기는데, 멀티스레드 환경에서는
		 * 		  여러 작업이 동시에 수행되므로 CPU의 대기시간이 줄어든다.
		 * 
		 * 멀티스레드 프로그래밍시 주의점
		 * 	- 동기화 처리가 복잡해진다.
		 * 	- 스레드가 많을수록 STACK메모리 공간이 줄어든다.	//스레드가 많을 수록, 메모리를 많이 차지함, 과부화가 오기 쉬움
		 * */
		
		// 단일 스레드
		//	- 명령문을 순차적으로 실행
		for(int i = 1; i<=100; i++) {
			System.out.println("작업 1["+ i + "]");
		}
		for(int i = 1; i<=100; i++) {
			System.out.println("작업 2["+ i + "]");
		}
		
		// 스레드 생성방법들
		// 1. Thread클래스를 상속
		Thread th1 = new Thread1();
		
		// 스레드 실행
//		th1.run();	//이렇게 하면 메인에서 작동함.	//메인메서드가 th1내부의 run매서드를 실행
		th1.start();	//스레드 가동
		// 스레드 생성 -> stack메모리 할당 -> run() 메서드 실행
		//스레드.PDF 참조
		
		// 2.Runnable 인터페이스를 구현 
		Thread th2 = new Thread(new Thread2());
		
		th2.start();
		
		// 3. 내부클래스를 통한 생성.
		// 지역내부 클래스
		class Thread3 extends Thread {	//다른 메서드에서 사용 불가 그닥 활용성이 좋지 않다.
			@Override
			public void run() {
				System.out.println("Thread3 가동");
			}
		}
		Thread th3 = new Thread3();
		th3.start();
		
		// 4. 익명 내부클래스
		Thread th4 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread4 가동");
			}
		};
		
		// 5. 람다식을 활용한 스레드 생성 ===>주로 사용됨
		Thread th5 = new Thread(() -> {
			System.out.println("Thread5 가동");
		});
		
		th4.start();
		th5.start();
		System.out.println("메인스레드 종료");
		
		/*
		 * 스레드의 특징
		 * 
		 * 1. 동시성
		 * 	- 멀티스레드 프로그래밍에서 여러개의 스레드가 동시에 실행되는 것처럼 보이는 현상으로,
		 * 	  실제로는 os의 "스케줄러"에 의해 스레드의 전환이 순식간에 이루어져 동시에 실행되는 것처럼
		 * 	  보이는 현상.(싱글코어)
		 * 	- 단, CPU코어의 개수가 많다면 실제로 여러개의 스레드가 동시에 실행된다.
		 * 
		 * 2. 병렬성
		 * 	- 멀티스레드 프로그래밍에서 여러개의 스레드가 동시에 실행되는것
		 * 	- 코의 개수만큼 동시에 실행된다.
		 * 
		 * 3. 독립성
		 * 	- 각 스레드는 독립적으로 실행되며, 다른 스레드의 영향을 받지 않는다.
		 * 	- 개별적인 실행 흐름을 보장하기 위해 고유 stack 영역을 할당 받는다.	(레지스터도 할당받음)
		 * 	- 메인쓰레드가 종료되더라도, 개별쓰레드가 실행중이라면 프로세스가 종료되지않는다.
		 * 
		 * */
		/*
		 * 
		[실습문제]
			알파벳 A~Z까지 출력하는 스레드 생성
			알파벳 a~z까지 출력하는 스레드 생성
			각 스레드 생성후 main 스레드에서 실행.
		*/
		System.out.println("=============================================");
		Thread high = new Thread(()->{
			System.out.println("대문자 스레드 시작");
			for(char i = 'A'; i <= 'Z'; i++) {	//(int i = 'A'; i<='Z'; i++)
				System.out.println("대문자 스레드 :"+i);	//("대문자 스레드 :" + (char)i)
			}
			System.out.println("대문자 스레드 종료");
		});
		
		
		Thread low = new Thread(()->{
			System.out.println("소문자 스레드 시작");
			for(char i = 'a'; i<='z'; i++) {
				System.out.println("소문자 스레드 :"+i);
			}
			System.out.println("소문자 스레드 종료");
		});

		//이렇게 해도됨
//		Thread low2 = new Thread(()->{
//			for(int i = 'a';i<'z'; i++) {
//				System.out.println(Thread.currentThread().getName()+" : " + (char)i);
//			}
//			System.out.println(Thread.currentThread().getName()+"종료");
//		});
//		low2.setName("소문자2스레드");
//		low2.start();
		
		high.start();
		low.start();
		
	}

}

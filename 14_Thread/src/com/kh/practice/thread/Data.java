package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean isEmpty = true;
	
	public Data() {	}	// 기본생성자
	
	public int setValue(int value) {
		// value 값 기록 저장함
		synchronized (this) {
			if(isEmpty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("값이 입력되었습니다.");
			isEmpty = false;
			notify();
			return value;
		}
		// 단, isEmpty 가 true가 될때까지 대기,true가 되면 기록처리하고, 
		// isEmpty값false로 바꾸고,
		// 대기중인 스래드를실행시킴동기화 처리함

		
	}
	public int getValue() {
		// value 값을 꺼냄
		synchronized (this) {
			if(isEmpty == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isEmpty = true;
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			notifyAll();
			return setValue(value);
		}
		// 단, isEmpty 가 false가 될때까지 기다림, false 가 되면
		// value를 꺼내고,isEmpty를 true로 바꾸고 대기상태의 스래드를 실행시킴
		// 값이 비었는데 꺼내려고 할 때EmptyException 발생시킴.동기화 처리함

		
	}

}

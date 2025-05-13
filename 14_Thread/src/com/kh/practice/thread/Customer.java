package com.kh.practice.thread;

public class Customer implements Runnable {

	private Data data;
	
	public Customer(Data data) {
		this.data = data;
		
	}
	public void run() {
		// Data가 가진 value값을 10 번 꺼내어출력한다.
		// 한번 출력하고 0.1초 중지
		for(int i = 1; i<=10; i++) {
			data.getValue();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

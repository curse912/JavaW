package com.kh.practice.thread;

public class Provider implements Runnable{
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
		
	}
	@Override
	public void run() {
		// Data의 value에 1부터 100사이의 정수를 기록하는 작업10번 실행한다.
		// 한번 기록하고 0.1중지
		for(int i = 1; i<=100; i++) {
			data.setValue(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

		
	}

}

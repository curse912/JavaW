package com.kh.practice.thread;

import java.util.Random;

public class Provider  extends Thread {
	private Data data;
	
	public Provider(Data data){
		this.data = data;
		
	}
	@Override
	public void run() {
		// Data의 value에 1부터 100사이의 정수를 기록하는 작업10번 실행한다.
		// 한번 기록하고 0.1중지
		for(int i = 1; i<=100; i++) {
			//1 부터 100 사이의 임의의 정수를 사용(random)
			int random = new Random().nextInt(100)+1;
			data.setValue(random);
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : "+random);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

		
	}

}

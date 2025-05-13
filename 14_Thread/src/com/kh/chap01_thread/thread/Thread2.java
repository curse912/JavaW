package com.kh.chap01_thread.thread;

public class Thread2 implements Runnable{

	//자동생성
	@Override
	public void run() {
		//내부코드는 내가.!
		for(int i = 1; i<=100; i++) {
			System.out.println("Thread2 ["+i+"]");
		}
		
	}

}

package com.kh.chap04_sync.part02_contorl.model.thread;

public class Provider implements Runnable{

	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			data.setData();		//저장하는 메서드
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

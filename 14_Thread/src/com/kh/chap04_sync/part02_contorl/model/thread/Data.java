package com.kh.chap04_sync.part02_contorl.model.thread;

public class Data {
	
	private int item;	// 생산·소비되는 아이템
	
	private boolean emty = true;	// item의 상태를 저장하고, 흐름을 제어하기 위한 변수
	
	// 아이템 소비용 메서드
	public void getData() {
		// 만약 item이 생산되기 전이라면, item을 소비하지 않도록 "대기"상태로 전환.
		synchronized(this) {
			if(emty == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
			item = 0;
			emty = true;
			System.out.println("소비자가 " + item + "을 소비하였습니다.");
			
			notify();	//wait 상태의 다른 쓰레드를 깨우는 역할을 수행	//자고있는 랜덤한 스레드를 깨움
		}
		
	}
	
	// 아이템 공급용 메서드
	public void setData() {
		synchronized(this) {
			// item이 비어있는 경우에만 item을 생성하기
			// item이 비어있지 않다면, 사용자가 소비할때까지 생산을 "대기"해야한다. 	//대기 => wait
			if(emty == false) {
				try {
					wait();	//대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			item = 1;
			emty = false;
			System.out.println("생산자가 " + item + "을 생산했습니다.");
			// 생산자가 생산을 완료한 후, 생산이 완료되었음을 소비자에게 "알려줘야한다."
			notifyAll();	// Waitting상태의 모든 쓰레드를 깨우는 매서드.
			
		}
			
		}

}

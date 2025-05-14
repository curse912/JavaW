package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean isEmpty = true;
	
	public Data() {	}	// 기본생성자
	
	public synchronized void setValue(int value) {	///synchronized왜붙나....
//		synchronized(this) {};	//위에 예약어로 사용했기 때문에 얘는 안해도됨
		//단, isEmpty 가 true가 될때까지 대기
		if(isEmpty == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// value 값 기록 저장함
			this.value = value;
			
		}
		//true가 되면 기록처리하고,
		System.out.println("값이 입력되었습니다.");
		// isEmpty값false로 바꾸고
		isEmpty = false;
		//대기중인 스래드를실행시킴동기화 처리함
		notify();
				
	}
	public synchronized int getValue() {
		//synchronized (this) {예약어에 synchronized를 썻기때문에 필요없다
			// 단, isEmpty 가 false가 될때까지 기다림,
			if(isEmpty == true) {
				try {//값이 비었는데 꺼내려고 할 때EmptyException 발생시킴
					throw new EmptyException("현재 입력된 값이 없습니다. 잠시 기다리세요....");
					
				}catch(EmptyException e ) {
//					System.out.println(("현재 입력된 값이 없습니다. 잠시 기다리세요....");
					System.out.println(e.getMessage());
					try {
						wait();
					} catch (InterruptedException ie) {
						e.printStackTrace();
					}
					
				}
			}
			//false 가 되면, isEmpty를 true로 바꾸고
			isEmpty = true;
			notify();
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			// value 값을 꺼냄
			return this.value;
		//}
		// 단, isEmpty 가 false가 될때까지 기다림, false 가 되면
		// value를 꺼내고,isEmpty를 true로 바꾸고 대기상태의 스래드를 실행시킴
		// 값이 비었는데 꺼내려고 할 때EmptyException 발생시킴.동기화 처리함

		
	}

}

package com.kh.chap04_sync.part01_synchronize.run;

import com.kh.chap04_sync.part01_synchronize.sync.ATM;
import com.kh.chap04_sync.part01_synchronize.sync.Account;

public class Run {
//스레드들이 메모리로 한번에 하나씩 접근할수있도록 제한함.
	public static void main(String[] args) {
		Account acc = new Account(); // 공유자원
		
		Thread ATM1 = new Thread(new ATM(acc),"ATM l");
		Thread ATM2 = new Thread(new ATM(acc),"ATM 2");
		
		ATM1.start();
//		ATM2.start();
		
		System.out.println("메인스레드 종료");
	}
}

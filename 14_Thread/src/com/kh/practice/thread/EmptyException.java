package com.kh.practice.thread;

import java.util.Scanner;

public class EmptyException {
	Scanner sc = new Scanner(System.in);
	
	public EmptyException(String message) {
		Thread putThread = new Thread(()->{
			System.out.println("put value : ");
			int value = sc.nextInt();
			sc.nextLine();
			
			
		});
		
		Thread getThread = new Thread(()->{
			System.out.println("put value : ");
			int value = sc.nextInt();
			sc.nextLine();
			
		});
		
		
		
	}

}

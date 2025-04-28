package com.kh.chap06.constructor;

import java.util.Scanner;

public class SnackMenu {
	//속성 필드(멤버변수)
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	//매서드
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf= sc.nextInt();
		
		System.out.print("가격 : ");
		int price= sc.nextInt();
		
		sc.nextLine();
		
		//입력한 값을 저장
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char chk = sc.nextLine().toLowerCase().charAt(0);	//toLowerCase는 사이에 넣음
		
		if(chk == 'y') {
			//String data = scr.confirmData();
			//System.out.println(data);
			System.out.println(scr.confirmData());
		}
		
		
	}

}

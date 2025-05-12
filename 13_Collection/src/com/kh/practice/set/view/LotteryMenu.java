package com.kh.practice.set.view;

import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : insertObject(); break;
			case 2 : deleteObject(); break;
			case 3 : winObject(); break;
			case 4 : sortedWinObject(); break;
			case 5 : searchWinner(); break;
			case 9 : System.out.println("프로그램 종료."); return;
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}			
		}		
	}
	
	public void insertObject() {
		System.out.println("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i =0; i<num; i++) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("핸드폰 번호('-'빼고) : ");
			String phone = sc.nextLine();
			
			Lottery l = new Lottery(name,phone);
			
			if(lc.insertObject(l)==false) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			}
			lc.insertObject(l);
		}
		System.out.println(num+"명 추가 완료되었습니다.");

//		단, 중복된 추첨 대상 입력했거나 또는 이미 추첨 Set에 대상이 있는 경우 “중복된 대상입니다. 다시 입력하세요.” 출력 후 이어서 다시 객체 입력.
//		모든 입력이 완료되면 “추가 완료되었습니다” 출력.
		
	}
	public void deleteObject() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("핸드폰 번호 (- 빼고) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name,phone);
		
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료 되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
		
//		삭제할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해
//		객체에 정보를 담아 lc에 객체를 보냄.
//		받은 결과에 따라 true면 “삭제 완료 되었습니다.”,
//		false면 “존재하지 않는 대상입니다.” 출력

	}
	public void winObject() {
		System.out.println(lc.winObject());
//		lc에서 받아온 Set객체를 println()메소드를 통해 출력

	}
	public void sortedWinObject() {
		TreeSet<Lottery> sorted = lc.sortedSinObject();
		for(Lottery l :sorted) {
			System.out.println(l);
		}
		
//		lc에서 받아온 Set객체를 Iterator를 통해 출력
	}
	public void searchWinner() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("핸드폰 번호 (- 빼고) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name,phone);
		if(lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
//		검색할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해
//		객체에 정보를 담아 lc에 객체를 보냄.
//		받은 결과에 따라 true면 “축하합니다. 당첨 목록에 존재합니다.”,
//		false면 “안타깝지만 당첨 목록에 존재하지 않습니다.” 출력
	}

}

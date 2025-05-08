package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			fileSave();
			break;
		case 2 :
			fileOpen();
			break;
		case 3 :
			fileEdit();
			break;
		case 9 : 
			System.out.println("프로그램을 종료합니다.");
			break;
		default : 
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			return;
			
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요. ");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다");
			System.out.print("내용 : ");
			String sf = sc.nextLine();
			
			sc.nextLine();
			
			if(sf.equals("ex끝it")) {
				// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장
				System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) :");
				String nfile = sc.nextLine();
				
				sc.nextLine();
				
				// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
				// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
				if(fc.checkName(nfile) ) {
					System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
					char answer = sc.nextLine().toLowerCase().charAt(0);
					
					// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
					if(answer == 'n') {
						return;
					}
				}
				// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
				// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
				fc.fileSave(nfile, sb);
			}
			
		}
	}
	public void fileOpen() {
		System.out.print("열 파일 명 :");
		String of = sc.nextLine();
		
		
		if(!fc.checkName(of)) {
			System.out.println("없는 파일입니다.");
			return;	
		}
		System.out.println(fc.fileOpen(of));
	}
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String ef = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		if(! fc.checkName(ef)) {
			System.out.println("없는 파일입니다.");
			mainMenu();	
		}
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요. ");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다");
			System.out.print("내용 : ");
			String sf = sc.nextLine();
			
			sc.nextLine();
			if(sf.equals("ex끝it")) {
				fc.fileEdit(sf,sb);
				break;
			}
			
		}
	}

}

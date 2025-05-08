package com.kh.practice.book.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bc.makeFile();
		Book[]bArr = bc.fileRead();

		
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 :");
			int num = sc.nextInt();
			
			sc.nextLine();
			
			switch(num) {
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println(" 프로그램 종료 "); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void fileSave() {	
		int num = 0;
		while(true) {
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 명 : ");
			String author = sc.nextLine();
			
			System.out.print("도서 가격 : ");
			int price = sc.nextInt();
			
			System.out.print("출판 날짜(yyyy-mm-dd) : ");
			String st = sc.nextLine();
			//대충 String을 date로 바꾸는 방법
			String[] date = st.split("-",3);
			
			Calendar c = Calendar.getInstance();
			int Year = c.get(Calendar.YEAR);
			int Month = c.get(Calendar.MONTH);
			int Day = c.get(Calendar.DATE);
			
			
//			Calendar cal = Calendar.getInstance();
//			int day = cal.get(Calendar.DATE);
//			
//			SimpleDateFormat.DATE_FIELD
			
			System.out.print("할인율 :");
			double discount = sc.nextDouble();
			
			bc.fileSave(bArr);
			
			
		}
		
		
			// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
			// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
			// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달

	}
	public void fileRead() {
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		System.out.println(bc.fileRead());
		
	}

}

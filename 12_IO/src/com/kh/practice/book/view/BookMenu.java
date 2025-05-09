package com.kh.practice.book.view;

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
		bc.makeFile();
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bArr = bc.fileRead();

		
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
			case 9: System.out.println(" 프로그램 종료 "); return;	//매서드 종료
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void fileSave() {	
//		int num = 0;
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();	//버퍼지우기는 sc.next자료형 을 사용할때 지워주기
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
//			String[] date = sc.nextLine().split("-");
		String st = sc.nextLine();
		
		System.out.print("할인율 :");
		double discount = sc.nextDouble();
		sc.nextLine();
		
		//왜 배열을 쓰는가유
		String[] dArr = st.split("-");
		
		//얘로도 해보기
//			Calendar date = new GregorianCalendar(
//					Integer.parseInt(dArr[0]),
//					Integer.parseInt(dArr[1])-1,
//					Integer.parseInt(dArr[2])
//					)
		
		Calendar date = Calendar.getInstance();
		int Year = date.get(Calendar.YEAR);
		int Month = date.get(Calendar.MONTH);
		int Day = date.get(Calendar.DATE);
		
		//몰루게써유....../////////
		Book b = new Book(title,author,price,date,discount);
		
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		for(int i = 0; i<bArr.length; i++ ) {
			if(bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		bc.fileSave(bArr);
	}
	public void fileRead() {
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		//애도 몰루
		Book[] books = bc.fileRead();
		for(Book b : books) {	//향상된 반복문
			if(b!=null) {	//초기화된 친구만 출력
				System.out.println(b);
			}
		}
		
	}

}

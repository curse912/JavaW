package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료 ");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : insertBook(); break;
			case 2 : selectList (); break;
			case 3 : searchBook (); break;
			case 4 : deleteBook (); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); return;
			}
		}					
	}
	
	public void insertBook() {
//		1. 도서명 입력받기 (String title)
//		2. 저자명 입력받기 (String author)
//		3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
//		4. 가격 입력받기 (int price)
//		5. 매개변수 생성자를 이용하여 Book 객체 생성
//		(객체 생성 시 장르 번호 별로 조건식 이용해 장르번호가 아닌 장르 명으로 값 넘겨야 함)
//		6. bc(BookController)의 insertBook으로 위의 Book 객체 전달
		System.out.println("== 새 도서 추가 ==");
		System.out.println("책 정보를 입력해주세요.");
		
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르 (1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int cg = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		String category = null;
		switch(cg) {
		case 1 : category = "인문"; break;
		case 2 : category = "과학"; break;
		case 3 : category = "외국어"; break;
		case 4 : category = "기타"; break;
		}
		
//		category == 1 ? "인문" : (category == 2 ? "과학" : (category == 3 ? "외국어" : "기타"))얘를 리스트값에 넣어도 됨.
		Book b = new Book(title, author, category ,price);
		
		
		bc.insertBook(b);
		
		
	}
	public void selectList() {
//		1. bc(BookController)의 selectList() 메소드를 호출 후
//		 --> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입
//		2. 조건식 이용해서
//		 2_1. bookList가 "비어있는 경우" --> "존재하는 도서가 없습니다." 라는 알람 문구 출력
//		 2_2. bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}else {
			for(Book s : bookList ) {
				System.out.println(s);
			}
		}

	}
	
	public void searchBook() {
		System.out.println("검색키워드 : ");
		String keyword = sc.nextLine();
		
//		bc.searchBook(keyword);
//		--> 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
//		 ** 결과 값이 한 도서의 Book 객체가 아니라 리스트인 이유
//		 보통 프로그램에서 검색 할 때 풀 네임을 쳐서 검색하지 않고 키워드로 검색
//		 즉, 키워드를 포함한 결과가 하나가 아닌 여러 개일 수 있기 때문에 리스트로 받기
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}
		/*
		//애는 안되나?/////////////////////////////////////===>bc.에 들어감
		if(! searchList.contains(keyword)) {
			System.out.println("검색결과가 없습니다.");
			
		}
		*/
		for(Book s : searchList) {
			System.out.println(s);
		}
	}
	public void deleteBook() {
		System.out.println("==== 도서삭제 ===");
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove == null) {
			System.out.print("삭제할 도서를 찾지 못했습니다.");
			return;
		}
		
		System.out.println("성공적으로 삭제되었습니다.");
		System.out.println("삭제된 도서 : "+remove);
		
		
		
		
//		** 도서명과 저자명을 같이 입력 받는 이유
//		 --> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
//		3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
//		--> 결과 값을 임의의 Book(Book remove)에 대입
//		4. 조건식 이용해서
//		 4_1. remove가 존재하는 경우 --> "성공적으로 삭제되었습니다."라는 문구 출력
//		 4_2. remove가 존재하지 않은 경우 --> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
		
	}
	public void ascBook() {
//		bc(BookController)의 ascBook() 메소드 값에 따라
//		성공 시 “정렬에 성공하였습니다.”, 실패 시 “정렬에 실패하였습니다.” 출력
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		}
		System.out.println("정렬에 실패하였습니다.");

	}

}

package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;
import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 :");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: joinMembership(); break;
			case 2: logIn(); memberMenu(); break;
			case 3: sameName();
			case 9: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");;			
			}
		}
		
		
	}
	public void memberMenu() {
		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃 ");
		System.out.println("메뉴번호 선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : changePassword(); break;
		case 2 : changeName(); break;
		case 3 : System.out.println("로그아웃 되었습니다."); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
		}
		
	}
	public void joinMembership() { //오류발생 : 중복된 아이디라고 계속뜸..
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String password = sc.nextLine();
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			Member m = new Member(password,name);
//			mc.joinMembership(id, m);	
			//====>mc.joinMembership(id, m)을 두번 호출하면 첫 호출에서 true가 저장되고
			//두번째 호출에서 한번 더 시도하기 때문에, 
			//이미 첫번째 mc.joinMembership(id, m)이 저장되어있어 result가 false가 나옴.
			boolean result = mc.joinMembership(id, m);
			if(result == true) {
				System.out.println("성공적으로 회원가입 완료했습니다.");
				break;
			}else {
				
				System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
			}
			
		}
		
//		회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은
//		Member객체에 담고 id와 객체는 MemberController(mc)의 joinMembership()로 보냄.
//		받은 결과에 따라 true면 “성공적으로 회원가입 완료하였습니다.”,
//		false면 “중복된 아이디입니다. 다시 입력해주세요.” 출력

	}
	public void logIn() {
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String password = sc.nextLine();
			
			mc.logIn(id, password);
			if(!(mc.logIn(id, password)==null)) {
				System.out.println("님, 환영합니다."/*이름!!!!!!*/);	//이름 어데갔누
				memberMenu();
				break;
			}else {
				System.out.println("틀린 아이디 또는 비밀 번호 입니다. 다시 입력해주세요");
			}
//			아이디와 비밀번호를 사용자에게 받아 mc의 logIn()메소드로 넘겨 줌
//			반환 값 있으면 “OOO님, 환영합니다!” 출력 후 로그인 된 화면으로(memberMenu()),
//			없으면 “틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.” 출력 후 반복
		}
		
	}
	public void changePassword() {
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("현재 비밀번호 : ");
			String oldPw = sc.nextLine();
			
			System.out.println("아이디 : ");
			String newPw = sc.nextLine();
			
			boolean result  = mc.changePassword(id, oldPw, newPw);
			if(result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			}
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
		
//		아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 chagePassword()로 보냄.
//		받은 결과 값이 true면 “비밀번호 변경에 성공했습니다.”,
//		false면 “비밀번호 변경에 실패했습니다. 다시 입력해주세요.” 출력 후 반복
		
	}
	public void changeName() {
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String password = sc.nextLine();
			
			if(mc.logIn(id, password)!=null) {
				mc.logIn(id, password);
				System.out.println("현재 설정된 이름 : "/*현재 이름*/);
				
				System.out.println("변경할 이름 : ");
				String newName = sc.nextLine();
				
				mc.changeName(id, newName);
				
				System.out.println("이름 변경에 성공했습니다.");
				break;
				
			}
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			
			
		}
//		아이디와 비밀번호를 받아 mc의 logIn()으로 넘겨 현재 저장되어 있는 이름을 받고
//		사용자에게 현재 저장되어 있는 이름을 출력하여 보여줌.
//		변경할 이름을 받아 mc의 chageName()로 id와 함께 넘기고
//		“이름 변경에 성공하였습니다.” 출력
//		만일 logIn()로부터 저장되어 있는 이름을 받지 못 했다면
//		“이름 변경에 실패했습니다. 다시 입력해주세요” 출력 후 반복
		
		
	}
	public void sameName() {
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		
		mc.sameName(name);
		
//		Set<Entry<String,Member>> entrySet = map.entrySet();
//		Iterator<Entry<String, Member>> iter = entrySet.iterator();
//		while(iter.hasNext()) {
//			Entry<String, Snack>entry = iter.next();
//			System.out.println(entry.getName()+"-"+ entry.getId());
//		}
		
//		검색할 이름을 받고 mc의 sameName()메소드로 넘김.
//		반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력
	}

}

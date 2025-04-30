package com.kh.hw.person.niew;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int[]count = pc.personCount();
		
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+count[0]+"명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 "+count[1]+"명입니다.");
		
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			switch (num) {
			case 1:  studentMenu(); break; 
			case 2:  employeeMenu(); break; 
			case 9:  System.out.println("종료합니다."); break; 
			default:  System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); return;
			}
		}
	}
	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		
		//int[] count = pc.personCount();
		//int와 int[] 은 다른것 유의!!!////////
		int count = pc.personCount()[0];
	
		if(count!=3) {
			System.out.println("학생은 최대 3명까지만 저장 할 수 있습니다.");
		}
		
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		
		switch (num) {
			case 2: 
				printStudent();
				break; 
			case 9: 
				System.out.println("메뉴로 돌아갑니다.");
				mainMenu();
				break; 
			case 1: 
				if(count != 3) {
					insertStudent(); 
					break; 
				}
			default:  
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				return;
		}
	}
	
	public void employeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		
		switch (num) {
		case 1: 
			insetEmployee();
			break; 
		case 2: 
			printEmployee();
			break; 
		case 9: 
			System.out.println("메뉴로 돌아갑니다.");
			mainMenu();
			break; 
		default:  
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			return;
	}
		
	}
	public void insertStudent() {
		new Student(null, 0, 0, null);
		
			int count = pc.personCount()[0];
			while(true) {
				
				System.out.print("학생 이름 : ");
				String name = sc.nextLine();
				
				System.out.print("학생 나이 : ");
				String age = sc.nextLine();
				
				System.out.print("학생 학년 : ");
				int grade = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("학생 전공 : ");
				String major = sc.nextLine();
				
				if(count!= 3) {
					System.out.print("그만 하시려면 n, 이어하시려면 아무키나 누르세요 : ");
					char ch = sc.nextLine().toLowerCase().charAt(0);
					if(ch == 'n') {
						studentMenu();
						break;
					}else if(count>3) {
						System.out.println("더 이상 학생을 추가 할 수 없습니다.");
//						break;
					}
				}
//				System.out.print("그만 하시려면 n, 이어하시려면 아무키나 누르세요 : ");
//				char ch = sc.nextLine().toLowerCase().charAt(0);
//				
//				if(ch == 'n') {
//					studentMenu();
//					break;
//				}
					
				
			}
	}
	
	public void printStudent() {
		//pc의 printStudent()메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
		//모든 데이터 출력
		Student[] arr = pc.printStudent();
		
		for(Student s : arr) {	//향상된 반복문
			if(s == null) {
				break;
			}
			System.out.println(s);
		}
	}
	
	public void insetEmployee() {		
		int[] count = pc.personCount();
		while(true) {
			
			if(count[1] >= 10) {
				System.out.println("더 이상 학생을 추가 할 수 없습니다.");
				break;
			}
			sc.nextLine();
			
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("사원 나이 : ");
			String age = sc.nextLine();
			
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			System.out.print("그만 하시려면 n, 이어하시려면 아무키나 누르세요 : ");
			char ch = sc.nextLine().toLowerCase().charAt(0);
			
			if(ch == 'n') {
				employeeMenu();
				break;
			}
				
			
		}
		
	}
	public void printEmployee() {
		Employee[] e = pc.printEmployee();
		for(Employee em : e) {
			if(em == null) {
				break;
			}
			System.out.println(em);
		}
	}
	
	

}

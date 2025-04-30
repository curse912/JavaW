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
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		
		switch (num) {
			case 1: 
				insertStudent(); 
				break; 
			case 2: 
				printStudent();
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
			int[] count = pc.personCount();
			while(true) {
				
				if(count[0] >= 3) {
					System.out.println("더 이상 학생을 추가 할 수 없습니다.");
					break;
				}
				sc.nextLine();
				
				System.out.print("학생 이름 : ");
				String name = sc.nextLine();
				
				System.out.print("학생 나이 : ");
				String age = sc.nextLine();
				
				System.out.print("학생 학년 : ");
				int grade = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("학생 전공 : ");
				String major = sc.nextLine();
				
				System.out.print("그만 하시려면 n, 이어하시려면 아무키나 누르세요 : ");
				char ch = sc.nextLine().toLowerCase().charAt(0);
				
				if(ch == 'n') {
					studentMenu();
					break;
				}
					
				
			}
	}
	
	public void printStudent() {
		Student[] s = pc.printStudent();
		for(Student st : s) {
			if(st == null) {
				break;
			}
			System.out.println(st);
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

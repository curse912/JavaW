package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력");
		System.out.println("9. 프로그램 종료");
		
		System.out.println("메뉴 번호를 누르세요 : ");
		int Num = sc.nextInt();
		
		sc.nextLine();
		
		while(true) {
			switch (Num) {
			case 1 :
				insertEmp();
				break;
			case 2 :
				updateEmp();
				break;
			case 3 :
				deleteEmp();
				break;
			case 4 :
				printEmp();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
	}
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("전화 번호 : ");
		String num = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().toLowerCase().charAt(0);
		
		ec.add(empNo, name, gender, num);
		
		if(ch == 'y') {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, num, dept, salary, bonus);
		}
		
	}
	public void updateEmp() {
		System.out.print("1. 전화번호");
		System.out.print("2. 사원 연봉");
		System.out.print("3. 보너스 율");
		System.out.print("9. 돌아가기 ");
		
		System.out.print(" 메뉴 번호를 누르세요 : ");
		int num = sc.nextInt();
	}
	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까? (y/n) : ");
		char chr = sc.nextLine().toLowerCase().charAt(0);
		
		if(chr == 'y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
		} 
	}
	public void printEmp() {
		System.out.println(ec.inform());
		
	}

}

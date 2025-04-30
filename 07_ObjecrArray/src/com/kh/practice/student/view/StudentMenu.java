package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	//학생정보와 성적,결과 출력
	public StudentMenu() {
		
		System.out.println("========== 학생 정보 출력 ==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		Student [] arr = ssm.printStudent();
		for(int i  = 0; i<arr.length; i++) {
			System.out.println(arr[i].inform());
		}
		System.out.println("========== 학생 성적 출력 ==========");
		double [] arr2 = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+ (int)arr2[0]);
		System.out.println("학생 점수 평균 : "+ arr2[1]);
		
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		System.out.println("========== 성적 결과 출력 ==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		for( Student std : arr ) { 	//변수:배열
			System.out.print(std.getName()+"학생은 ");
			if(std.getScore() < StudentController.CUT_LINE) {	//ssm.CUT_LINE 으로 사용하면 안됩
				System.out.println("재시험 대상입니다.");
			}else {
				System.out.println("통과입니다.");
			}
		}
		
	}
	

}

package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];	// [nul   ,null  ,null ]
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] arr = new int[2];
		//배열의 인덱스에 들어간 값이 null이라면 저장되지 않은 인덱스
		
		//int stCount = 0;
		//int emCount = 0;
		for(int i = 0; i<3; i++) {
			if(s[i]!=null) {
				//stCount++;
				arr[0] += 1 ;
			}
		}
		/*for(int i = 0; i<10; i++) {
			if(e[i]!=null) {
				arr[1] += 1;
			}
		}*/
		for(Employee emp : e) {
			if(emp != null) {
				arr[1] += 1;
			}
		}
		//int[] result = {stCount,emCount};
		return arr;
		
		
	}
	public void insertStudent(String name, int age, int grade, String major) {
		//s[0] = new Student(name, age, grade, major);
		Student std = new Student(name, age, grade, major);
//		int[] count = personCount();
		
//		if(count[0]>=3) {
//			System.out.println("학생은 최대 3명까지만 저장 할 수 있습니다.");
//			return;
//		}
		
		for(int i = 0; i<s.length; i++) {
			if(s[i] == null) {
//				s[i] = new Student(name, age, grade, major);
				s[i] = std;
				break;
			}
		}		
	}
	public Student[] printStudent() {
		return s;
		
	}
	public void insertEmployee(String name, int age,int salary, String dept) {
		int[] count = personCount();
		
		if(count[0]>=10) {
			System.out.println("사원은 최대 10명까지만 저장 할 수 있습니다.");
			return;
		}
		
		for(int i = 0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, salary, dept); 
				break;
			}
		}
		
	}
	public Employee[] printEmployee() {
		return e;
		
		
	}

}

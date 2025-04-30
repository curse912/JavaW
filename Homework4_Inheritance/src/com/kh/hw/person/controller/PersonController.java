package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int stCount = 0;
		int emCount = 0;
		for(int i = 0; i<3; i++) {
			if(s[i]!=null) {
				stCount++;
			}
		}
		for(int i = 0; i<10; i++) {
			if(e[i]!=null) {
				emCount++;
			}
		}
		int[] result = {stCount,emCount};
		return result;
		
		
	}
	public void insertStudent(String name, int age, int grade, String major) {
		//s[0] = new Student(name, age, grade, major);
		int[] count = personCount();
		
		if(count[0]>=3) {
			System.out.println("학생은 최대 3명까지만 저장 할 수 있습니다.");
			return;
		}
		
		for(int i = 0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, grade, major);
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

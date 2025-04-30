package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public final static int CUT_LINE = 60;	//대문자일경우 final을사용함
	
	//5개의 객체배열(arr)을 샘플데이터(내가 적은 초기화값)의 값으로 초기화
	public StudentController() {
		//Student는 (name,subject,score)순이므로 형태에 맞게 입력
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비", 50);
		sArr[2] = new Student("이길동","화면", 85);
		sArr[3] = new Student("정길동","서버", 60);
		sArr[4] = new Student("홍길동","자바", 20);
	}
	
	//객체배열(arr)에 있는 데이터 반환(리턴)
	public Student[] printStudent() {
		return sArr;
	}
	
	//객체 배열의 점수를 합한 값 리턴(반환)
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	//double배열을 만들고, 0번째 인덱스 : sumScore의 리턴값 저장
	//					1번째 인덱스 : 합의평균
	//배열리턴
	public double[] avgScore() {
		double[] arr = new double[2];
		arr[0] = sumScore();	//점수총 합계
		arr[1] = arr[0] / 5.0;
		
		return arr;
	}
}

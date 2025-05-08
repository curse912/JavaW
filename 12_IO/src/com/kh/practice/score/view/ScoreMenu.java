package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();
			
			sc.nextLine();
			
			switch(num) {
			case 1: saveScore(); break;
			case 2: readScore(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}	
		}
	}
	public void saveScore() {
		int num = 0; // 학생 숫자를 나타낼 변수
		while(true) {
			System.out.println(++num + "번 째 학생 정보 기록");	//++num으로 표현
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			int sum = kor + eng + math ;
			double avr = sum/3.0;
			scr.saveScore(name, kor, eng, math, sum, avr);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.nextLine().toLowerCase().charAt(0);
			
			if( ch == 'n' ) {
				break;
			}
		}
	}
	
	
	
	//여기가 제일 어렵........................................................................
	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		
		//여기부분 이해필요../////////////////////////////////////////////////////////////////////////////////////////////////////
		try/*(DataInputStream ds = new DataInputStream(new FileInputStream("파일명.txt")))*/{
			DataInputStream ds = scr.readScore();
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");	//\t는 tap을 뜻함.
			while(true) {
				String name = ds.readUTF();
				int kor = ds.readInt();
				int eng = ds.readInt();
				int math = ds.readInt();
				int sum = ds.readInt();
				double avr = ds.readDouble();
				
				count++;
				sumAll += sum;
				avgAll += sumAll/(double) count;
				
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",name,kor,eng,math,sum,avr);
			}
			
			
		}catch(EOFException e) {
			System.out.println("읽은횟수\t전체합계\t전체평균");
			System.out.println(count +"\t"+sumAll+"\t"+avgAll);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

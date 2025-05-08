package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
///프로젝트 누르고 F5

public class BufferedDao {
	/*
	 * 보조 스트림
	 * 	- 기반스트림의 부족한 기능들을 "확장"시킬 수 있는 스트림들
	 * 	- 보조스트림은 단독으로는 사용이 불가능.
	 * 
	 * [표현법]
	 * 보조스트림 변수명 = new 보조스트림(기반스트림객체);
	 * 
	 * 보조스크림 여러개 추가
	 * 보조스트림1 변수명 = new 보조스트림1(new 보조스트림2(기반스트림객체););
	 * 데코레이터패턴
	 * 
	 * BufferdXXX : "속도 성능 향상" 목적의 보조스트림
	 * 	=> 데이터를 바로 출력/입력 하는것이 아니라 
	 * 		크기가 큰 버퍼공간을 만들어서 데이터를 모아두었다가 한번에 입출력을 진행함
	 */
	
	// BufferedReader / BufferedWriter
	public void fileSave() {
		//BufferedWriter bw = null;
		
		// 만약 보조스트림이 Writer라면 기반스트림도 Writer이어야한다.
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {	// 뒤에 new FileWriter클릭하면 catch문나옴
			
			bw.write("안녕하세요");
			bw.newLine();	// 개행문자 추가
			bw.write("저리가세요\n");
			
			bw.flush();	// 버퍼공간을 비워주는 메서드
			// flush 메서드는 close()실행시 자동으로 호출되는 매서드
			// 버퍼공간이 다 채워지지않은 상태에서 매서드가 종료될때, 버퍼에 담겨있는 데이터가 누락될수 있으므로
			// flush 함수를 통해 버퍼를 비워줘야한다.
			
//			close문 : 출력 (close문 안의 flush매서드 역할)
//			close문을 사용하지않으면 buffer 공간에 머물렀다가 넘어감.
//			try/catch 문에 close문이 들어가있음 ==> jdk7버전부터 try/catch문이 존재
			
			// 출력 후 10초 대기
			try {
				Thread.sleep(10000);	//ms단위
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void fileRead() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

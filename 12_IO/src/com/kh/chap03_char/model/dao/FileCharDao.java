package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	public void fileSave() {
		// FileWriter
		// try - with Resource문
		// 스트림 자원 객체 생성시 사용
		// 객체사용 종료시 자원 자동 반납 [(close())매서드 자동 ]
		
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			
			fw.write("또 쉬고싶다...");
			fw.write('a');
			fw.write('민');
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

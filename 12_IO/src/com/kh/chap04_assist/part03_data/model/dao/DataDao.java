package com.kh.chap04_assist.part03_data.model.dao;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataDao {
	// DataXXX => 기본자료형 단위로 입출력을 지우너하는 보조스트림
	
	
	// 기반스트림(FileOutputStream) - 바이트 기반스트림으로 스트림 연결
	// 보조스트림1(DataOutputStream) - 기본자료형 입출력 기능 추가
	// 보조스트림2(OutputStreamWriter) - 바이스트림을 문자스트림으로 변경
	// 보조스트림3(BufferedWriter) - 속도성능 향상
	public void fileSave() {
		try(BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new DataOutputStream(
								new FileOutputStream(new File("sample.txt")))));
				DataOutputStream ds = new DataOutputStream(new FileOutputStream("sample2.txt"))
						) {
			//객체 API_Wrapper클래스 
				ds.writeBoolean(true);
				ds.writeInt(300);
				ds.writeDouble(3.14);
				ds.writeChar('민');
				ds.writeUTF("문자열 작성");	//문자열 저장지원
					
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		//저장된 자료형의 순서에 맞춰서 읽기
		
		try(DataInputStream ds = new DataInputStream(new FileInputStream("sample2.txt"))){
			
			ds.readBoolean();
			System.out.println(ds.readInt());
			System.out.println(ds.readDouble());
			System.out.println(ds.readChar());
			System.out.println(ds.readUTF());
			// 더이상 읽을 데이터가 없으면 에러발생
			ds.readBoolean();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

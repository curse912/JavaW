package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	//같은 이름의 파일 확인
	public boolean checkName(String file) {
		//FileInputStream fin = null;
		File cfile  = new File(file);	//File클래스의 객체 File을 cfile변수에 저장  -> new File(file)이라는 껍데기 생성
		return cfile.exists();	//실제로 존재하는 파일인지 확인
//		boolean isExist = cfile.exists();
//		return isExist;
		
	}
	public void fileSave(String file, String s) {
		try(FileWriter fw = new FileWriter(file)) {	//file에  s값을 입력해야함.
			fw.write(s);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(FileReader fr = new FileReader(file)){	//e뒤에문 누르면 자동으로 catch문 두개만들어줌
			int value = 0;
			while((value = fr.read()) != -1) {
				sb.append((char)value);
			}
		}catch(FileNotFoundException e) {	///애는 왜쓰는걸까
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return sb;
	}
	public void fileEdit(String file, String s) {
		try(FileWriter fw = new FileWriter(file,true)){
			fw.write(s);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}

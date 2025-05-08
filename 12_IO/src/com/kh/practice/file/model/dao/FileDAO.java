package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.FileInputStream;

public class FileDAO {
	public boolean checkName(String file) {
		//FileInputStream fin = null;
		File cfile  = new File(file);
		
		boolean isExist = cfile.exists();
		return isExist;
		
	}
	public void fileSave(String file, String s) {
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(s);
		
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line).append("\n");
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return sb;
	}
	public void fileEdit(String file, String s) {
		
	}

}

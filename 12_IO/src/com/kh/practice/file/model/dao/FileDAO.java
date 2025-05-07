package com.kh.practice.file.model.dao;

import java.io.File;
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
		
		try(File sfile = new File(file)){
			
			
		}
		
		
//		File sfile = new File(file);
//		try {
//			sfile.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
	
	public StringBuilder fileOpen(String file) {
		
		
	}
	public void fileEdit(String file, String s) {
		
	}

}

package com.kh.practice.file.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	FileOutputStream fout = null;
	
	public boolean checkName(String file) {
		return fd.checkName(file);
//		boolean result = false;
//		
//		if(fd.checkName(file)) {
//			result = true;
//		}
//		return result;

		
		
	}
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file,sb.toString());
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
//		StringBuilder sb = new StringBuilder();
//	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//	        String line;
//	        while ((line = reader.readLine()) != null) {
//	            sb.append(line).append("\n");
//	        }
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
//	    return sb;
	}
	public void fileEdit(String file, StringBuilder sb) {
//		sb.append(file);
		fd.fileEdit(file,sb.toString());
		
	}
}

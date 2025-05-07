package com.kh.practice.file.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	FileOutputStream fout = null;
	
	public boolean checkName(String file) {
		boolean result = false;
		
		if(fd.checkName(file)) {
			result = true;
		}
		return result;
		
//		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고
//		fd.checkName(file);
//		// 그리고 그 반환 값을 그대로 받아 또 반환해줌
//		try {
//			fout.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
	}
	public void fileSave(String file, StringBuilder sb) {
		
		sb.append(file);
		String result = sb.toString();
		fd.fileSave(file, result);
		
		
	}
	
	public StringBuilder fileOpen(String file) {
		fd.fileOpen(file);
		//반환...................
		
		
	}
	public void fileEdit(String file, StringBuilder sb) {
		sb.append(file);
		String result = sb.toString();
		fd.fileEdit(file, result);
		
	}
}

package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		//book.txt가 없을 때 만들어줌
		try{
			File file = new File("book.txt");
			file.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
		
	}
	public Book[] fileRead() {
		return bd.fileRead();
	}

}

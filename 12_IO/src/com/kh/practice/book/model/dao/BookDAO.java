package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
		// “book.txt”를 매개변수로 받는 File 객체를 생성하여 book.txt가 없다면 파일 생성
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("book.txt"))){
			for(Book bk : bArr) {
				os.writeObject(bk);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Book[] fileRead() {
		// 저장된 객체를 읽어오는 스트림인 ObjectInputStream을 가지고
		// book.txt에 저장된 객체를 필드 bArr에 저장하여 반환
		// 더 이상 파일에 읽을 게 없을 때 뜨는 예외인 EOFException이 발생하면
		// 예외만 잡아주고 안에는 아무 처리도 하지 않음

		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("book.txt"))){
			int a = 0;
			while(true) {
				try {
					Book b = (Book)os.readObject();
					if(a < bArr.length) {
						bArr[a++] = b;
					}
				}catch (EOFException e) {
					break;
				}
				
			}
		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bArr;
	}

}

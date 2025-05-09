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
			for(Book bk : bArr) {	//향상된 반복문
				if(bk !=null) {		// 초기화된 값만 출력
					os.writeObject(bk);	
					
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
					Book b = (Book)os.readObject();
					bArr[a++] = b;
//					bArr[a++] = (Book)os.readObject();	//위랑 같은내용쓰
					
				}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return bArr;
	}

}

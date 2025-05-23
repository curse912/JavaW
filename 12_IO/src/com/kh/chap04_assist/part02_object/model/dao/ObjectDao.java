package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	//객체단위 입출력을 지원하는 보조 스트림.
	//ObjectXXX
	
	public void fileSave() {
		Phone ph = new Phone("아이폰",1500000, "010-1234-5678");
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d_object.txt"))){
			
			os.writeObject(ph);
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("d_object.txt"))){
			
			Phone ph = (Phone)os.readObject();
			System.out.println(ph);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//객체배열 저장 및 읽어오기
	public void fileSave2() {
		Phone[] arr = {
				new Phone("아이폰",2000000,"12345678"),
				new Phone("갤럭시",1000000,"12345679"),
				new Phone("샤오미",800000,"87654321")
		};
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("e_objectArray.txt"))){
			
			for( Phone ph : arr ) {
				os.writeObject(ph);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void fileRead2() {
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("e_objectArray.txt"))){
			while(true) {
				System.out.println(os.readObject());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// EOPFeception : End Of File의 약자
			// readObject 더이상 읽어올 데이터가 없는 경우 발생하는 에러
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

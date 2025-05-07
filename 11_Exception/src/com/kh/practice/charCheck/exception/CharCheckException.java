package com.kh.practice.charCheck.exception;

import java.io.IOException;

public class CharCheckException extends IOException{//IOException은 import 해줘야지만 사용가능
	//extends RuntimeException(= IOException)이게 왜들어가는 걸까.../////////////////////////
	
	public CharCheckException() {}
	public CharCheckException(String msg) {
		//매개변수(msg)로 받은 값을 부모 생성자(super())로 넘기는 생성자
		super(msg);
	}

}

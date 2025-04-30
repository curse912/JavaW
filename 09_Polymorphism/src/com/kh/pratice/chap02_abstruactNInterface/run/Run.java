package com.kh.pratice.chap02_abstruactNInterface.run;

import com.kh.pratice.chap02_abstruactNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		//기울기 : 추상 클래스
		//대문자 : 인터페이스
		//밑줄 : static
		//실선 화살표 : extends
		//점선 화살표 : implement
		PhoneController pc = new PhoneController();
		String[] result = pc.method();	//반환형 문자열 계열
		for(String s : result) {
			System.out.println(s);
		}
	}

}

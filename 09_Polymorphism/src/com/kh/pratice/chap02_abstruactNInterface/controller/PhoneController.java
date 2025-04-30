package com.kh.pratice.chap02_abstruactNInterface.controller;

import com.kh.pratice.chap02_abstruactNInterface.mode.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] arr = new Phone[2];
		arr[0] = new GalaxyNote9(); 
		arr[1] = new V40();
		
		result[0] = ((GalaxyNote9)arr[0]).printInformation();	//다운캐스팅 필요
		result[1] = ((V40)arr[1]).printInformation();
		
		return result;
		
		
//		result[0] = ("번호를 누르고 통화버튼을 누름","수신 버튼을 누름","1200만 듀얼 카메라","고속 충전, 고속 무선 충전","정전식, 와콤펜 지원","true");
//		result[1] = ("번호를 누르고 통화버튼을 누름","수신 버튼을 누름","1200, 1600만 트리플 카메라","고속 충전, 고속 무선 충전","정전식","true");
		
		
	}
			

}

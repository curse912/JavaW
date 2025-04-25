package com.kh.chap03_field.model.vo;

public class FieldTest2 {
	/*
	 * 접근제한자(생략시 자동 defaut)
	 * (+)public => 어떤 패키지의 클래스에서든 접근 가능하도록 설정
	 * (#)protected => 같은 패키지내에서만 사용하도록 설정
	 * 다른 패키지인경우 상속받은 클래스에서도 추가로 접근 가능하도록 할 때 사용
	 * (~)default => 같은 패키지 내에서만 사용하도록 설정
	 * (-)private => 같은 클래스에서만 접근 가능하도록 설정
	 * 
	 * */
	public String pub = "public";
	protected String pro = "protexted";
	String df = "default";
	private String pri = "private";

}

package com.kh.chap02_abstract.part01.model.vo;

public class Football extends Sports{
	
	/*
	 * 추상클래스를 상속받게 되면, 추상 클래스의 추상 메소드를 반드시 구현해줘야 컴파일 에러가 사라진다.*/
	@Override
	public void rule() {
		// TODO Auto-generated method stub
		System.out.println("발로 공을 차서 골대에 넣어야한다.");
		
	}
	
	
	

}

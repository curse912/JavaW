package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		//s.getHeight 초기화
		s = new Shape(4,height, width);
		return s.getHeight()*2 + s.getWidth()*2;
	}
	
	public double calcArea(double height, double width) {
		//s.getHeight 초기화
		s = new Shape(4, height, width);
		return s.getHeight()*s.getWidth();
	}
	
	//setter를 이용해 받아온 매개변수로 값변경
	public void paintColor(String color) {
		s.setColor(color);		
	}
	
	//s.informaiton의 반환값 합쳐서 반환
	public String print() {
		return "사각형"+s.information();
	}
}

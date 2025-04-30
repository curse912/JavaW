package com.kh.pratice.point.contorller;

import com.kh.pratice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	//String....?
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		
		double result = Math.PI*(radius*radius); 
		return "면적 : "+ c +" / " + result;
//		return Math.PI*(radius*radius);
		
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double result = Math.PI*radius*2; 
		return "둘레 : "+ c +" / " + result;
//		c = new Circle(x, y, radius);
//		return Math.PI*radius*2;
		
	}

}

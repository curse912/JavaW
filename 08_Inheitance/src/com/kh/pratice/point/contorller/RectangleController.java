package com.kh.pratice.point.contorller;

import com.kh.pratice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	//String..?
	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		double result = width*height; 
		return "면적 : "+ r +" / " + result;
//		return width*height;
		
	}
	
	//String...?
	public String calcPerimeter(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		double result = 2*(width+height); 
		return "둘레 : "+ r +" / " + result;
		//return 2*(width+height);
		
	}
	
	

}

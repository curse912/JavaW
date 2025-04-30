package com.kh.pratice.point.model.vo;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		//this.getX(x);
		//this.getY(y);
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", width : " +width + " , height : "+ height;
	}
	

}

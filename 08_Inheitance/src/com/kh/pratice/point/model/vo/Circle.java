package com.kh.pratice.point.model.vo;

public class Circle extends Point{
	private int radius;

	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		//this.getX(x);
		//this.getY(y);
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " +radius;
		
	}
	

}

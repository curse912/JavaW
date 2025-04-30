package com.kh.hw.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	
	public Shape() {}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	//높이 너비 색깔을 반환
	public String information() {
		return height +" "+ width +" "+ color;
	}

	//type
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	//height
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	//width
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	//color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

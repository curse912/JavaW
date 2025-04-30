package com.kh.chap02_abstract.practice3.model.vo;

public class Dog extends Animal{
	public static final String PLACE = "애견카페";
	private int weight ;
	
	public Dog() {}

	public Dog(String name, String kind,int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getPlace() {
		return PLACE;
	}
	
	
	@Override
	public void speak() {
		String result = super.toString()+"몸무게는 " + weight + "kg 입니다.";
		System.out.println(result);
	}
	
}

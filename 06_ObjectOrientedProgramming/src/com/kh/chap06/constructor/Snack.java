package com.kh.chap06.constructor;

public class Snack {
	//속성 필드(멤버변수)
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자
	public Snack(){}	//기본생성자
	
	public Snack(String kind, String name, String flavor, int numOf,int price){
		this.kind = kind;	//private kind(this.kind) 멤버변수(필드)에 kind 매개변수를 저장
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
	}
	
	//매서드
	//kind getter/setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	//name getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//flavor getter/setter
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	//numOf getter/setter
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	//price getter/setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price= price;
	}

	
	//얘는 printf 같은애가 없나,,
	public String information() {
		return kind + "( " + name + " - " + flavor + " ) " + numOf + "개 " + price + "원";
		};
}

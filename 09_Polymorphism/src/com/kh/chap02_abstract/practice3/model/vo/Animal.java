package com.kh.chap02_abstract.practice3.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {}
	
	//# => protected
	//~=> default

	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종은 " + kinds + "입니다.";
	}

	public abstract void speak();
	

}

package com.kh.chap02_lamda.practice.model.vo;

@FunctionalInterface
public interface Calculator<Integer,String> {

	 String operate(Integer a); 
	

}

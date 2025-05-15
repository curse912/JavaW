package com.kh.chap02_lamda.practice.model.vo;

@FunctionalInterface
public interface MyFunction<Integer,String> {
	
//	 void apply(int x, Stirng y);
	 String apply(Integer x);

	
}

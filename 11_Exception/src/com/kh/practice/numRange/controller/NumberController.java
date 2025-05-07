package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController  {
	public NumberController() {}
	public boolean checkDouble(double num1, double num2) throws NumRangeException{
		//매개변수(num1,num2)로 들어온 값들이 배수인지 boolean 값 반환
		
		boolean result = false;
		if(0 > num1 || num1 > 100 || 0 > num2 || num2 > 100) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
			//throw가 실행되면 다음 코드는 작동하지않음.
		}
		return num1 % num2 == 0;
//		if(num1 % num2 == 0) {
//			result = true;
//		}
//		return result;
		
	}

}

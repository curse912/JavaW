package com.kh.pratice.chap02_abstruactNInterface.mode.vo;


///////////오잉 두개 extends 할려면 ','쓰면됨..
public interface CellPhone extends Phone, Camera {
	abstract String charge();
	
}

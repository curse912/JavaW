package com.kh.pratice.chap02_abstruactNInterface.mode.vo;

public interface Phone {
	
	static char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	abstract String makeCall();
	
	abstract String takeCall();
	

}

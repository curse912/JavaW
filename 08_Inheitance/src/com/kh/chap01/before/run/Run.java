package com.kh.chap01.before.run;

import com.kh.chap01.before.model.vo.Desktop;

public class Run {
	public static void main(String[] args) {
		Desktop dk = new Desktop("삼성","d-001","데스크탑",2000000,true);
		
		System.out.println(dk.information());
	}

}

package com.kh.example.practice1.run;

import com.kh.example.practice1.medel.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();
		m.changName("정은비");
		m.printName();
	}
}

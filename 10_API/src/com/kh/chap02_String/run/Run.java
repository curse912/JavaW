package com.kh.chap02_String.run;

import com.kh.chap02_String.controller.A_StringPool;
import com.kh.chap02_String.controller.B_StringBuilerAndBuffer;
import com.kh.chap02_String.controller.C_StringTokenizer;
import com.kh.chap02_String.controller.D_StringMethods;

public class Run {
	public static void main(String[] args) {
		A_StringPool asp = new A_StringPool();
		asp.method1();
		
		B_StringBuilerAndBuffer bsb = new B_StringBuilerAndBuffer();
		bsb.method();
		
		C_StringTokenizer cst = new C_StringTokenizer();
		cst.method();
		
		D_StringMethods dsm = new D_StringMethods();
		dsm.method();
	}

}

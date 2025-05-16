package com.kh.chap02_lamda.practice;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Practice6 {
	
	public static void main(String[] args){
		List<String> names = Arrays.asList("Jin", "Suga", "RM", "J-Hope", "V");
		
		Comparator<String> comp = getComparator("length");
		names.sort(comp);
		System.out.println(names); // 길이순 정렬
		
		comp = getComparator("reverse");
		names.sort(comp);
		System.out.println(names); // 알파벳 역순 정렬
	}
	public static Comparator<String> getComparator(String mode) {
	 //코드 구현
//		Objects.requireNonNull(mode);
//		return (Comparator<Stirng> & Serializable) (c1, c2) -> {
//            int res = compare(c1, c2);
//            return (res != 0) ? res : mode.compare(c1, c2);
//        };

		switch(mode) {
		case "length" : //왜 이게 길이순 정렬일깜
			return (x,y)-> x.length() - y.length();
		case "reverse" : //얘는 왜 역순정렬일깜
			return (x,y)-> y.compareTo(x);
		default : throw new RuntimeException("제공하지 않는 정렬 방식입니다.");	//에러발생
		}
//		Objects.requireNonNull(mode);//얘도 비어있을때 에러발생
		
    
	};
	
}

package com.kh.chap03_field.run;

import com.kh.chap03_field.model.vo.FieldTest1;
import com.kh.chap03_field.model.vo.FieldTest2;
import com.kh.chap03_field.model.vo.FieldTest3;

public class Run {
	public static void main(String[] args) {
		FieldTest1 ft1 = new FieldTest1();
		//ft1.test(0);
		
		FieldTest2 ft2 = new FieldTest2();
		//ft2.pub = "z";
		//이후 FieldTest1 에서 선언가능
		
		FieldTest3 ft3 = new FieldTest3();
		System.out.println(ft3.sta);	//객체 생성할 필요가 없음
		System.out.println(ft3.PI);
		//=> 에러는 나타나지 않지만 불필요 방법임
		
		//static 변수 사용 방법
		//클래스명.변수명
		
		//아래로 쓰는걸 권장
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.PI);
		//클래스명.메서드명();
		FieldTest3.test();
	}

}

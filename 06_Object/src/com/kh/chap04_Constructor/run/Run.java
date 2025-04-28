package com.kh.chap04_Constructor.run;

import com.kh.chap04_Constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		
		User user = new User();	//기본생성자
		//기본생성자가 없어도 JVM에서 자동 추가해줌
		//매개변수 생성자를 명시적으로 작성하게 되면 JVM이 만들어주지 않음
		
		User user2 = new User("user01",20,'남');
		
	}

}

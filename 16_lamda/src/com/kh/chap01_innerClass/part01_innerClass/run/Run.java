package com.kh.chap01_innerClass.part01_innerClass.run;

import com.kh.chap01_innerClass.part01_instance.OuterClass;
import com.kh.chap01_innerClass.part02_static.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
//		OuterClass.InnerClass inner = oc.new InnerClass();	// 뒤에를 생성자라 한다ㅏㅏ
//		oc.method();
		
//		System.out.println(OuterClass.InnerClass.sNum);
		
		Member m = new Member
				.Builder()
				.setId("alsrudals")
				.setName("민경민")
				.setAge(30)
				.build();
		
		/*
		 * 빌더클래스 이용시 장점
		 *  - 불필요한 생성자들을 제거
		 *  - 필드의 순서에 상관없이 객체 생성 가능
		 *  - 명시적인 메서드명으로 가독성 확보
		 *  - VO클래스에 SETTER존재하지 않음으로써 불변성 유지 가능
		 *  - 올바른 값이 초기화 되었는지 build()를 통해 검증이 가능
		 */
	}

}

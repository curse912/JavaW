package com.kh.chap06.constructor;

public class SnackController {
	//속성 필드(멤버변수)
	private Snack s  = new Snack();
	
	//생성자
	public SnackController(){}
	
	//매서드
	public String saveData(String kind, String name, String flavor,int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		//s = new Snack(kind, name, flavor, numOf, price); 이렇게 해도됨
		
		return "저장이 완료되었습니다.";
		
	}
	
	//confirmData를 이용해서 저장된 데이터 반환
	public String confirmData() {
		// s.getKind() + "(" + s.getName().....
		//information에서 만듦

		return s.information();
	}

}

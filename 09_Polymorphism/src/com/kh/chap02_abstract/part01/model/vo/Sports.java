package com.kh.chap02_abstract.part01.model.vo;

public abstract class Sports {
	private int people;	//스포츠레 참여하는 선수 수
	
	public Sports() {}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	/*
	 * 추상메서드
	 * 	- 몸통부가 존재하지 않는 미완성된 메서드
	 * 	- 추상 메서드를 사용하기 위해선, avstract예약어를 추가해야 한다.
	 * 	- 클래스 내부에 추상메서드가 하나라도 존재하는 순간, 클래스 또한 추상클래스로 만들어 줘야 한다.
	 * 
	 * 추상클래스를 사용하는 경우
	 * 	- 부모클래스로 사용하면서, 모든 자식클래스에서 공통으로 구형해야하는 메서드가 존재하는 경우 메서드의
	 * 	  강제를 위해 추상 클래스를 사용한다.
	 * */
	
	//상속+기능강제
	public abstract void rule();
	//{}몸통부분을 지워야함. 미완성 매서드이므로 abstract를 넣어줘야함.
	//에러가 생기므로 class에도 abstract를 넣어줘야함.

}

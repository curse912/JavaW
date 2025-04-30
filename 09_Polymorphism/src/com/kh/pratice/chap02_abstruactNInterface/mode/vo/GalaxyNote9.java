package com.kh.pratice.chap02_abstruactNInterface.mode.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	public GalaxyNote9() {}
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	@Override
	public String picture() {
		return "1300만 듀얼카메라";
	}
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	@Override
	public boolean bluetoothPen() {
		return true;
	}
	
	@Override
	public String printInformation() {
		setMaker("삼성");
		String result = "갤럭시 노트9d은 "+getMaker()+"에서 만들어졌고 지원은 다음과 같다.\n";
		result += makeCall()+"\n";
		result += takeCall()+"\n";
		result += picture()+"\n";
		result += charge()+"\n";
		result += touch()+"\n";
		result += "블루투스 펜 탑재 여부 : "+bluetoothPen()+"\n";
		
		return null;
	}
	/*
	@Override
	public String getMaker() {
		return super.getMaker();
	}
	@Override
	public void setMaker(String maker) {
		super.setMaker(maker);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}*/
	
	

}

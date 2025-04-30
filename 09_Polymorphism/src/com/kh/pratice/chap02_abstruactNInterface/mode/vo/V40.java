package com.kh.pratice.chap02_abstruactNInterface.mode.vo;

public class V40 extends SmartPhone implements NotePen{
	public V40() {}
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
		return "1200, 1600만 화소 트리플 카메라";
	}
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	@Override
	public String touch() {
		return "정전식";
	}
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	@Override
	public String printInformation() {
		setMaker("LG");
		String result = "V40은 "+getMaker()+"에서 만들어졌고 지원은 다음과 같다.\n";
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
	}
	*/
	

}

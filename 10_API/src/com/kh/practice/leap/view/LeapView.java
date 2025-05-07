package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		
		Calendar c = new GregorianCalendar();
		LeapController lc = new LeapController();
		boolean isLeapYear = lc.isLeapYear(c.get(Calendar.YEAR));
		
		
		System.out.println(c.get(Calendar.YEAR)+"년은 "+(isLeapYear ? "윤년" : "평년" )+"년 입니다.");
		System.out.println("총 날짜 수 : " + lc.leapDate(c));
	
		
	}

}

package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	//연도가 윤년이면 true,평년이면 false 리턴
	public boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	
	//1년1월1일 부터 오늘까지의 총 날 수를 계산
	public long leapDate(Calendar c) {
		
		// 1년부터 2024까지의 평일수 구하기
		long total = 0;
		for(int i = 1; i<c.get(Calendar.YEAR)-1; i++) {
			total += 365;
			if(isLeapYear(i)) {
				total += 1;
			}
			
		}
		//현재 년도에서 일수 구하기
		int month = c.get(Calendar.MONTH)+1;
		
		switch(month) {
		case 1 :
		case 3 :
		case 5:
		case 7:
		case 8:
		case 10:
		case 12 :
			total+=31;
			break;
		case 4 :
		case 6:
		case 9:
		case 11 :
			total+=30;
			break;
		case 2 :
			total += (isLeapYear(c.get(Calendar.YEAR)) ? 29 : 28);
		}
		//이번달 일수 더하기
		total += c.get(Calendar.DATE);	//5월7일 => +7;
		
		return total;
		
		
	}

}

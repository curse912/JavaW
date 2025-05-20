package com.kh.practice.enumpractice;

public class EnumPractice2 {
	public static void main(String[] args){
		System.out.println(MemberGrade2.BASIC.getDiscountInfo());
		System.out.println(MemberGrade2.VIP.getDiscountInfo());
		System.out.println(MemberGrade2.valueOfGrade("SILVER"));
		System.out.println(MemberGrade2.valueOfGrade("GOLD"));
		}

}

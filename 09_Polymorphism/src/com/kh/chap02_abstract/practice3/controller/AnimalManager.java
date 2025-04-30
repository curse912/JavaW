package com.kh.chap02_abstract.practice3.controller;

import com.kh.chap02_abstract.practice3.model.vo.Animal;
import com.kh.chap02_abstract.practice3.model.vo.Cat;
import com.kh.chap02_abstract.practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal a ;
		
		Animal[] arr = new Animal[5];
		int rd = (int)(Math.random()*2)+1;
		arr[0] = new Dog("뽀삐","말티즈",3);
		arr[1] = new Cat("코코", "브숏", "고양이카페","회색");
		arr[2] = new Dog("호두", "브숏", 3);
		arr[3] = new Cat("두두", "브숏", "스트리트","노랑");
		arr[4] = new Dog("초고", "토이푸들", 5);
		
		

		for(int i= 0; i<5; i++) {
			if(rd == 1) {
				arr[i].speak();
					
			}
		}
		
	}
	

}

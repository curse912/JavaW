package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		// 중복된 추첨 대상 입력했거나 또는 이미 추첨 Set에 대상이 있는 경우
		if(lottery.contains(l)) 
			return false;
		if(win.contains(l))
			return false;
		return lottery.add(l);	//add는 boolean 값임
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		
	}
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		if(result && win != null && !win.isEmpty()) {
			win.remove(l);
		}
		return result;
		// 전달 받은 l을 lottery에서 삭제
		// 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
		// 삭제 결과인 boolean 값과 win객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제

	}
	
	////어렵다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
	public HashSet winObject() {
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		ArrayList<Lottery> list = new ArrayList<>(lottery);

		// 인덱스를 이용해 win에 당첨자 저장
		if(lottery.size()<4) {
			return null;
		}
				
		while(win.size()<4) {
			// 랜덤 인덱스의 범위 0 ~ size()-1
			int random = new Random().nextInt(list.size()/*랜덤값의 범위*/); //(int)(Math.random()*list.size());
			win.add(list.get(random));	
		}
		return win;
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
	}
	
	////////////어려ㅕ워유ㅠㅜ우우ㅡ우
	public TreeSet sortedSinObject() {
		winObject();
		TreeSet<Lottery> ts = new TreeSet<>(new SortedLottery());	//comperator 자동정렬
		ts.addAll(win);
		return ts;
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함
		
	}
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		//get, contains, 반복문 : 방법 3가지
	}
	

}

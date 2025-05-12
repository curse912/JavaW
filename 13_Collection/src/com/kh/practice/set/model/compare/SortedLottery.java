package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery>{
	
	@Override
	public int compare(Lottery o1, Lottery o2) {
//		return o1.getName().compareTo(o2.getName());	//오름차순일때
		// 이름이 같으면
		if( o1.getName().compareTo(o2.getName()) == 0 ) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
		return o1.getName().compareTo(o2.getName());
	}

}

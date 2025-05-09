package com.kh.chap01_list.arrylist.model.vo;

import java.util.Comparator;

public class MusicArtistDeScending implements Comparator<Music>{

	//add implements
	@Override
	public int compare(Music o1, Music o2) {	//내부에서 비교
		
		
		return o1.getArtist().compareTo(o2.getArtist());	//오름차순
//		return -o1.getArtist().compareTo(o2.getArtist());	//내림차순
	}
	
	

}

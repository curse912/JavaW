package com.kh.chap04_assist.part03_data.run;

import com.kh.chap04_assist.part03_data.model.dao.DataDao;

public class Run {
	public static void main(String[] args) {
		DataDao dao = new DataDao();
//		dao.fileSave();
		dao.fileRead();
		
	}
}

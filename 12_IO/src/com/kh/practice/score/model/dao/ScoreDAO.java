package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreDAO {
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try(DataOutputStream ds = new DataOutputStream(new FileOutputStream("score.txt",true))){	
			//new FileOutputStream("score.txt",true) 끝에 true를 해야 이어쓰기 가능
			ds.writeUTF(name);
			ds.writeInt(kor);
			ds.writeInt(eng);
			ds.writeInt(math);
			ds.writeInt(sum);
			ds.writeDouble(avg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	
	///얘도 먼가했다.
	public DataInputStream readScore() throws FileNotFoundException{
		DataInputStream ds = new DataInputStream(new FileInputStream("score.txt"));
		return ds;
	}

}

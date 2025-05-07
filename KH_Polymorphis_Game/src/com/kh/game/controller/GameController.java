package com.kh.game.controller;

import com.kh.game.job.model.vo.Characters;
import com.kh.game.job.model.vo.Warrior;
import com.kh.game.monster.model.vo.Dragon;
import com.kh.game.monster.model.vo.Monster;

public class GameController {
	private Characters character;
	
	public void createCharacter(int job, String name){
		switch(job) {
		case 1: 
			//이름, hp, atk, level
			new Warrior(name,1,2,10,10,0);
		case 2:
			//궁수
		case 3:
			//법사
		}
		return character;
	}
	
	public Characters getCharacter() {
		return character;
		
	}
	
	public Monster createMonster(int num) {
		Monster m;
		
		switch(num) {
		case 1 : 
		case 2:
		case 3:
			m = new Dragon("드래곤",2000,200,300);
			break;
		default : 
			m = null;
		}
		
	}

}

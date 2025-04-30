package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Warrior extends Characters {
	
	public Warrior() {}
	public Warrior (String name, int level , int atk , int hp, int maxHp, int exp) {
		super(name, level, atk, hp, maxHp,exp);
	}
	
	
	public String toString() {
		return "직업 : 전사" +super.toString();
	}
	
	public void attack(Monster m) {
		//atkRange = atk*3
		//attack = (Math.random()*atkRange + 1)
		int rAtk = (int)(Math.random()*getAtk() + 1);
		return (m.getHp()-= rAtk);
		System.out.println(name + "가 검을 휘둘렀습니다.\n" +m.name+"체력 : -"+ atk +", 남은체력 : "+m.Hp);
		
	}
	public void useSkill(Monster m) {
		//저장 몬스터hp = 몬스터.Hp - (웨리어 atk*2);
		return m.hp = m.getHp()-(getAtk()*2);
		//sysout c.name + "가 검을 휘둘렀습니다.\n" +m.name+"체력 : -"+atk+", 남은체력 : "+몬스터.Hp; 
		System.out.println(name + "가 스킬 강타를 사용했습니다.\n" +m.name+"체력 : -"+ atk +", 남은체력 : "+m.Hp);
	}
	
	
	public void levelup() {
		setLevel(getLevel()+1);
		setMaxHp(getMaxHp()+10); //초기 = 10
		setAtk(getAtk()+3);	//초기 = 2
		setHp(getMaxHp());
		
		
		
	}
	

}

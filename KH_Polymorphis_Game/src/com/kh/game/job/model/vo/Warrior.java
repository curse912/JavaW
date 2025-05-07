package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Warrior extends Characters {
	
	public Warrior() {
		super();
	}
	public Warrior (String name, int level , int atk , int hp, int maxHp, int exp) {
		super(name, level, atk, hp, maxHp,exp);
	}
	
	
	public String toString() {
		return "직업 : 전사" +super.toString();
	}
	
	public void attack(Monster m) {
		//atkRange = atk*3
		//attack = (Math.random()*atkRange + 1)
		int dmg = (int)(Math.random() * (getAtk()*3) + 1);
		m.setHp(m.getHp()-dmg);
//		return (m.getHp()-= rAtk);
		System.out.println(getName() + "가 검을 휘둘렀습니다.");
		System.out.println(m.getName()+"체력 : -"+ dmg +", 남은체력 : "+m.getHp());
		
	}
	public void useSkill(Monster m) {
		int sdmg = m.getHp()-(getAtk()*2);
		//저장 몬스터hp = 몬스터.Hp - (웨리어 atk*2);
//		return m.hp = m.getHp()-(getAtk()*2);
		//sysout c.name + "가 검을 휘둘렀습니다.\n" +m.name+"체력 : -"+atk+", 남은체력 : "+몬스터.Hp; 
		System.out.println(getName() + "가 스킬 강타를 사용했습니다." );
		System.out.println(m.getName()+"체력 : -"+ sdmg +", 남은체력 : "+m.getHp());
	}
	
	
	public void levelup() {
		setLevel(getLevel()+1);
		setMaxHp(getMaxHp()+10); //초기 = 10
		setAtk(getAtk()+2);	//초기 = 2
		setHp(getMaxHp());
		
		
		
	}
	

}

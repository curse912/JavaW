package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Wizard extends Characters {
	public Wizard() {}
	public Wizard (String name, int level , int atk , int hp, int maxHp, int exp) {
		super(name, level, atk, hp, maxHp,exp);
	}

	public String toString() {
		return "직업 : 마법사" +super.toString();
	}
	
	public void attack(Monster m) {
		return m.hp = (m.getHp()-= getAtk());
		System.out.println(name + "가 지팡이를 휘둘렀습니다.\n" +m.name+"체력 : -"+ atk +", 남은체력 : "+m.Hp);
	}
	
	public void useSkill(Monster m) {
		//저장 몬스터hp = 몬스터.Hp - (웨리어 atk*2);
		return m.hp = m.getHp()-(getAtk()*3);
		//sysout c.name + "가 검을 휘둘렀습니다.\n" +m.name+"체력 : -"+atk+", 남은체력 : "+몬스터.Hp; 
		System.out.println(name + "가 스킬 지건을 휘둘렀습니다.\n" +m.name+"체력 : -"+ atk +", 남은체력 : "+m.Hp);
	}
	
	
	public void levelup() {
		setLevel(getLevel()+1);
		setMaxHp(getMaxHp()+100);	///초기 = 500
		setAtk(getAtk()+2);	//초기 = 2
		setHp(getMaxHp());
		
	}

}

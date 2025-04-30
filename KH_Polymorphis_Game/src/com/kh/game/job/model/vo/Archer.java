package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Archer {
	public Archer() {}
	public Archer (String name, int level , int atk , int hp, int maxHp, int exp) {
		super();
	}
	
	public String toString() {
		return "직업 : 궁수" +super.toString();
	}
	
	public void attack(Monster m) {
		//atkRange = atk*3
		int rAtk = atk+level*2;
		return (m.getHp()-= rAtk);
		System.out.println(name + "가 활을 쐇습니다.\n" +m.name+"체력 : -"+ atk +", 남은체력 : "+m.Hp);
	}
	
	public void useSkill(Monster m) {
		//저장 몬스터hp = 몬스터.Hp - (웨리어 atk*2);
		return m.hp = m.getHp()-((getAtk()*2)+(getLevel()*3));
		//sysout c.name + "가 검을 휘둘렀습니다.\n" +m.name+"체력 : -"+atk+", 남은체력 : "+몬스터.Hp; 
		System.out.println(name + "가 스킬 멀티샷을 사용했습니다.\n" +m.name+"체력 : -"+ atk +", 남은체력 : "+m.Hp);
	}
	
	public void levelup() {
		setLevel(getLevel()+1);
		setMaxHp(getMaxHp()+5); //초기 = 5
		setAtk(getAtk()+3);	//초기 = 3
		setHp(getMaxHp());
	}

}

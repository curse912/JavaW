package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public class Dragon extends Monster {
	private int count;
	
	public Dragon() {}
	public Dragon(String name, int atk, int hp, int exp) {
		super(name,atk,hp,exp);
	}
	
	@Override
	public void attack(Characters c) {
		if(count % 3 == 0) {
			breath(c);
		}else {
			c.setHp(c.getHp() - getAtk());
		}
		c.setHp(c.getHp() - getAtk());
		count++;
	}
	
	@Override
	public void breath(Characters c) {
		c.setHp(c.getHp() - getAtk() * 5);
		
		
		
	}
	

}

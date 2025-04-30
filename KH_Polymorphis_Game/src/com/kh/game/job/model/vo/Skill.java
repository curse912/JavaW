package com.kh.game.job.model.vo;

import javax.management.monitor.Monitor;

import com.kh.game.monster.model.vo.Monster;

public interface Skill {
	
	Monitor m = new Monster();
	abstract void useSkill(Monster m)

}

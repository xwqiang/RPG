package com.test.skill;

import java.util.TimerTask;

import com.test.hero.Hero;

public class SkillStateChillingTask extends TimerTask {
	private int reduce ;
	private Hero hero ;
	private int attack_timeout ;
	public SkillStateChillingTask(int reduce,Hero hero){
		this.reduce = reduce;
		this.hero  = hero ;
	}
	public void run(){
		attack_timeout = hero.getDamage().getAttack_timeout();
		if(attack_timeout > 0){
			hero.getDamage().setAttack_timeout(attack_timeout - reduce);
		}
	}
}

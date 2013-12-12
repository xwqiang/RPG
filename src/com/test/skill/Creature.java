package com.test.skill;


import java.util.ArrayList;
import java.util.List;

import com.test.hero.Hero;

public class Creature {

	protected int blood;
	protected List<Creature> list;
	private boolean alive = true;

	public Creature() {
		this.list = new ArrayList<Creature>();
	}

	public void attack(Creature enermy) {
		if(alive){
			int strength = (int) (Math.random()*100);
			enermy.hurted(strength);
		}
	}

	public void attackMass() {
		for(Creature h:list){
			int strength = (int) (Math.random()*100);
			h.hurted(strength);
		}
	}

	public void hurted(int strength) {
		setBlood(blood-strength);
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		if(alive){
			this.blood = blood;
		}
		if(blood<=0){
			alive = false;
		}
	}

	public void addEnermy(Creature h) {
		list.add(h);
	}

}
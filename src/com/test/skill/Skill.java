package com.test.skill;

import com.test.hero.Hero;


public class Skill {
	private String name;
	private int ready;	//cd 时间 ready = -1 表示被动技能
	private boolean using;
	private int added;
	private int rated;
	public int getReady() {
		return ready;
	}
	public void setReady(int ready) {
		this.ready = ready;
	}
	public boolean isUsing() {
		return using;
	}
	public void setUsing(boolean using) {
		this.using = using;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysicalDamage() {
		return 0;
	}
	
}

package com.test.skill;



public class Skill implements ISkill{
	private String name;
	private int ready;	//技能cd时间 ready = -1 表示被动技能
	private boolean using;
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
	public int getMagicDamage(){
		return 0;
	}
	
}

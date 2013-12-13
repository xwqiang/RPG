package com.test.skill.damage;

import com.test.hero.Hero;
import com.test.skill.Skill;

public class Damage {
	private int base_harm;
	private Hero injurer;//被攻击者
	private Hero attacker;//发起攻击者
	public Damage(int base_harm){	
		this.base_harm = base_harm;
	}
	public int creazyBeat(){
		if(!injurer.getLifeState().isAlive()) { return 0 ; }
		int base_damage = (int) (Math.random()*5+base_harm);
		int physical_damage = physicalDamage();
		int magic_damage = magicDamage();
		injurer.getLifeState().reduceBlood(base_harm + physical_damage);
		return base_damage + physical_damage + magic_damage;
	}
	public int physicalDamage(){
		int physical_damage = 0 ;
		for(Skill sk : attacker.getSkillAggregation().getUsableSkill()){
			physical_damage += sk.getPhysicalDamage();
		}
		return physical_damage;
	}
	public int magicDamage(){
		return 0;
	}
	public Hero getInjurer() {
		return injurer;
	}
	public void setInjurer(Hero injurer) {
		this.injurer = injurer;
	}
	public Hero getAttacker() {
		return attacker;
	}
	public void setAttacker(Hero attacker) {
		this.attacker = attacker;
	}
	public int getBase_harm() {
		return base_harm;
	}
	public void setBase_harm(int base_harm) {
		this.base_harm = base_harm;
	}
	
	
}

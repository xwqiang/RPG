package com.test.hero;

import java.util.ArrayList;

import com.test.skill.Skill;
import com.test.skill.SkillAggregation;
import com.test.skill.damage.Damage;
import com.test.skill.effect.Effect;




public class Hero implements INature{
	protected String name;
	protected LifeState lifeState;
	protected SkillAggregation skillAggregation;
	protected Damage damage;
	
	public Hero() {
		this.name = "hero";
		this.lifeState = new LifeState();
		this.skillAggregation = new SkillAggregation(new ArrayList<Skill>());
		this.damage = new Damage(20);
	}

	public void attack(Hero enermy) {
		if(this.lifeState.isAlive()&&enermy.lifeState.isAlive()){
			AttackMethedRequest attackMR = new AttackMethedRequest(this);
			attackMR.attack(enermy);
		}
	}
	public void hurted(int physical_damage, int magic_damage,Effect effect) {
		System.out.println("physical_damage->"+physical_damage);
	}

	


	public void addSkill(Skill skill){
		skillAggregation.addSkill(skill);
	}

	public void useSkill(Skill skill) {
		skillAggregation.useSkill(skill);
	}

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}

	public SkillAggregation getSkillAggregation() {
		return skillAggregation;
	}

	public void setSkillAggregation(SkillAggregation skillAggregation) {
		this.skillAggregation = skillAggregation;
	}

	public LifeState getLifeState() {
		return lifeState;
	}

	public void setLifeState(LifeState lifeState) {
		this.lifeState = lifeState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean beforAttack() {
		return true;
	}

	public boolean afterAttack() {
		return true;
	}
	
	
}

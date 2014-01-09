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
	
	public Hero(String name) {
		this.name = name;
		this.lifeState = new LifeState();
		this.skillAggregation = new SkillAggregation(new ArrayList<Skill>());
		this.damage = new Damage(20);
	}
	
	public boolean attack(Hero enermy) {
		AttackMethedRequest attackMR = new AttackMethedRequest(this);
		return attackMR.attack(enermy);
	}
	public void hurted(int physical_damage, int magic_damage,Effect effect) {
		lifeState.reduceBlood(physical_damage+magic_damage);
		if(lifeState.isAlive()){
			System.out.println(name+"get hurted :physical_damage->"+physical_damage+" magic_damage-->"+magic_damage+" ");
		}else{
			System.out.println(name+"get hurted :physical_damage->"+physical_damage+" magic_damage-->"+magic_damage+" ");
			System.out.println(name + " is beaten dead");
		}
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

	public boolean beforAttack(Hero enermy) {
		//enery is dead
		if(!enermy.getLifeState().isAlive()){
			System.err.println(name + " is dead and can't attack");
			return false;
		}
		//your skill is not ready
		if(damage.getAttack_timeout()>0){
//			System.err.println("waiting for ready your skills");
			return false;
		}
		return true;
	}

	public boolean afterAttack() {
		return true;
	}
	
	
}

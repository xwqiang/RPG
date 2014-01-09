package com.test.skill.damage;

import com.test.skill.Skill;
import com.test.skill.SkillAggregation;
import com.test.skill.effect.Effect;

public class Damage {
	private int base_harm;
	private int attack_speed;//millisecond
	private volatile int attack_timeout;
	private int base_attack_timeout;
	
	private int physical_harm;
	
	private int magic_harm;
	private Effect effect;
	private SkillAggregation skills;
	
	
	public int getAttack_timeout() {
		return attack_timeout;
	}
	public void setAttack_timeout(int attack_timeout) {
		this.attack_timeout = attack_timeout;
	}
	public void reweapon(){
		this.attack_timeout = base_attack_timeout;
	}
	public int getAttack_speed() {
		return attack_speed;
	}
	public void setAttack_speed(int attack_speed) {
		this.attack_speed = attack_speed;
	}
	public Damage(int base_harm) {
		attack_speed = 2000;
		this.base_harm = base_harm;
	}
	public int getBase_harm() {
		return base_harm;
	}
	public void setBase_harm(int base_harm) {
		this.base_harm = base_harm;
	}
	public int getPhysical_harm() {
		for(Skill sk : skills.getUsableSkill()){
			
		}
		return physical_harm;
	}
	public void setPhysical_harm(int physical_harm) {
		this.physical_harm = physical_harm;
	}
	public int getMagic_harm() {
		return magic_harm;
	}
	public void setMagic_harm(int magic_harm) {
		this.magic_harm = magic_harm;
	}
	public Effect getEffect() {
		return effect;
	}
	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	public SkillAggregation getSkills() {
		return skills;
	}
	public void setSkills(SkillAggregation skills) {
		this.skills = skills;
	}
	public int strick() {
		int harm = (int) (Math.random()*15+this.getBase_harm());
		reweapon();
		return harm;
	}
	public int getBase_attack_timeout() {
		return base_attack_timeout;
	}
	public void setBase_attack_timeout(int base_attack_timeout) {
		this.base_attack_timeout = base_attack_timeout;
	}
	
////	private Hero injurer;//被攻击者
////	private Hero attacker;//发起攻击者
//	public Damage(int base_harm){	
//		this.base_harm = base_harm;
//	}
//	public int creazyBeat(){
//		if(!injurer.getLifeState().isAlive()) { return 0 ; }
//		int base_damage = (int) (Math.random()*5+base_harm);
//		int physical_damage = physicalDamage();
//		int magic_damage = magicDamage();
//		injurer.getLifeState().reduceBlood(base_harm + physical_damage);
//		return base_damage + physical_damage + magic_damage;
//	}
//	public int physicalDamage(){
//		int physical_damage = 0 ;
//		for(Skill sk : attacker.getSkillAggregation().getUsableSkill()){
//			physical_damage += sk.getPhysicalDamage();
//		}
//		return physical_damage;
//	}
//	public int magicDamage(){
//		return 0;
//	}
//	public Hero getInjurer() {
//		return injurer;
//	}
//	public void setInjurer(Hero injurer) {
//		this.injurer = injurer;
//	}
//	public Hero getAttacker() {
//		return attacker;
//	}
//	public void setAttacker(Hero attacker) {
//		this.attacker = attacker;
//	}
//	public int getBase_harm() {
//		return base_harm;
//	}
//	public void setBase_harm(int base_harm) {
//		this.base_harm = base_harm;
//	}
	
	
}

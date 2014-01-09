package com.test.hero;

import com.test.skill.damage.Damage;
import com.test.skill.effect.Effect;

public class AttackMethedRequest {
	private Hero hero;

	public AttackMethedRequest(Hero hero) {
		this.hero = hero;
	}
	public boolean attack(Hero enermy){
		if(!hero.beforAttack(enermy)){ return false;}
		
		System.err.println("<" + hero.getName() + "> started to attack <"+enermy.getName() + ">");
		Damage damage = hero.getDamage();
		damage.setSkills(hero.getSkillAggregation());
		int base_damage = damage.strick();
		int physical_damage = damage.getPhysical_harm() + base_damage;
		int magic_damage = damage.getMagic_harm();
		Effect effect = damage.getEffect();
		enermy.hurted(physical_damage, magic_damage, effect);
		hero.afterAttack();
		return true;
	}
}

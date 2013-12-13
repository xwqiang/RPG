package com.test.hero;

import com.test.skill.effect.Effect;

public class AttackMethedRequest {
	private Hero hero;

	public AttackMethedRequest(Hero hero) {
		this.hero = hero;
	}
	public void attack(Hero enermy){
		int base_damage = (int) (Math.random()*5+this.hero.getDamage().getBase_harm());
		int physical_damage = this.hero.getDamage().physicalDamage() + base_damage;
		int magic_damage = this.hero.getDamage().magicDamage();
		Effect effect = new Effect();
		
		enermy.hurted(physical_damage, magic_damage, effect);
	}
}

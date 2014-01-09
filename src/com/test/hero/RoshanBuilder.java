package com.test.hero;

import com.test.skill.Thump;

public class RoshanBuilder extends HeroBuilder {
	public RoshanBuilder(){
		hero = new Hero("Roshan");
	}
	@Override
	public void BuildDamageEngine() {
		hero.getDamage().setBase_harm(20);
		hero.getDamage().setAttack_timeout(2000);
		hero.getDamage().setBase_attack_timeout(2000);
		hero.getDamage().setPhysical_harm(20);
		hero.getDamage().setMagic_harm(10);
		hero.getDamage().setSkills(hero.getSkillAggregation());
	}

	@Override
	public void BuildLifeState(int blood, int attack_speed, int armor) {
		hero.getLifeState().setAlive(true);
		hero.getLifeState().setBlood(blood+100);
	}

	@Override
	public void BuildSkillAggregation() {
		hero.getSkillAggregation().addSkill(new Thump());
	}
}

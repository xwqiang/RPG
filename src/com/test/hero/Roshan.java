package com.test.hero;


import com.test.skill.Skill;
import com.test.skill.Thump;

public class Roshan extends Hero {
	private Skill skill;
	public Roshan() {
		super();
		this.getSkillAggregation().addSkill(new Thump());
	}

}

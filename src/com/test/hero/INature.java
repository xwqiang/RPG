package com.test.hero;

import com.test.skill.Skill;
import com.test.skill.damage.Damage;

public interface INature {
	
	public void attack(Hero enermy);
	
	public void hurted(Damage damage);
	
	
	public void addSkill(Skill skill);
	
	public void useSkill(Skill skill);
	
}

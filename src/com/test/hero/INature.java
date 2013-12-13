package com.test.hero;

import com.test.skill.Skill;
import com.test.skill.effect.Effect;

public interface INature {
	
	public void attack(Hero enermy);
	
	public void hurted(int physical_damage, int magical_damage,Effect effect);
	
	
	public void addSkill(Skill skill);
	
	public void useSkill(Skill skill);
	
}

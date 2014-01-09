package com.test.hero;

import com.test.skill.Skill;
import com.test.skill.effect.Effect;

public interface INature {
	
	public boolean attack(Hero enermy);
	
	public void hurted(int physical_damage, int magic_damage,Effect effect);
	
	
	public void addSkill(Skill skill);
	
	public void useSkill(Skill skill);
	
}

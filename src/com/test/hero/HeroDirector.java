package com.test.hero;

public class HeroDirector {
	 public void createHero(HeroBuilder concreteBuilder){  
	       concreteBuilder.BuildLifeState(100, 2, 2);
	       concreteBuilder.BuildSkillAggregation();
	       concreteBuilder.BuildDamageEngine();
	       concreteBuilder.initSkill();
	       concreteBuilder.getHero();
	   }  
}

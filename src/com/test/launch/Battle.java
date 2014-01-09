package com.test.launch;

import com.test.hero.Hero;
import com.test.hero.heroBuilder.HeroBuilder;
import com.test.hero.heroBuilder.HeroDirector;
import com.test.hero.heroBuilder.RoshanBuilder;
import com.test.skill.Thump;



public class Battle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroBuilder roshanBuilder = new RoshanBuilder();
		HeroDirector director = new HeroDirector();
		director.createHero(roshanBuilder);
		Hero roshan = roshanBuilder.getHero();
		Hero hero2 = new Hero("play2");
		roshan.addSkill(new Thump());
		hero2.getLifeState().setBlood(300);
//		Hero hero3 = new Hero();
		int times = 15;
		while(times > 0 && hero2.getLifeState().isAlive()){
			if(roshan.attack(hero2)){
				times--;
			}
		}
//		hero1.attack(hero2);
//		hero2.attack(hero1);
//		hero1.addEnermy(hero2);
//		hero1.addEnermy(hero3);
//		System.out.println(hero1.getBlood());
		System.out.println(hero2.getLifeState().getBlood());
//		System.out.println(hero3.getBlood());
	}

}

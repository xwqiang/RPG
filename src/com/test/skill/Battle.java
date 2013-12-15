package com.test.skill;

import com.test.hero.Hero;



public class Battle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero();
		Hero hero2 = new Hero();
		hero1.addSkill(new Thump());
		hero2.getLifeState().setBlood(50);
//		Hero hero3 = new Hero();
		hero1.attack(hero2);
		hero1.attack(hero2);
//		hero1.attack(hero2);
//		hero2.attack(hero1);
//		hero1.addEnermy(hero2);
//		hero1.addEnermy(hero3);
//		System.out.println(hero1.getBlood());
		System.out.println(hero2.getLifeState().getBlood());
//		System.out.println(hero3.getBlood());
	}

}

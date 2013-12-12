package com.test.skill;



public class Battle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creature hero1 = new Creature();
		Creature hero2 = new Creature();
		Creature hero3 = new Creature();
		hero1.attack(hero2);
//		hero1.attack(hero2);
//		hero2.attack(hero1);
		hero1.addEnermy(hero2);
		hero1.addEnermy(hero3);
		hero1.attackMass();
		System.out.println(hero1.getBlood());
		System.out.println(hero2.getBlood());
		System.out.println(hero3.getBlood());
	}

}

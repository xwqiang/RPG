package com.test.hero.heroBuilder;

import java.util.Timer;

import com.test.hero.Hero;
import com.test.skill.SkillStateChillingTask;

public abstract class HeroBuilder {  
	protected Hero hero ;
    //构建生命
    public abstract void BuildLifeState(int blood,int attack_speed,int armor);  
    //构建技能  
    public abstract void BuildSkillAggregation();  
    //构建伤害
    public abstract void BuildDamageEngine();  
    //获取hero
    public Hero getHero(){
    	return hero;
    }
    
    public void initSkill(){
    	Timer timer = new Timer();  
    	int time = 200;
    	timer.schedule(new SkillStateChillingTask(time,hero), 0, time);  
    	
    }
}  
package com.test.skill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.test.util.SkillIterator;

public class SkillAggregation {
	private List<Skill> skills ;
	public SkillAggregation(List<Skill> skills){
		this.skills = skills;
	}
	public Iterator<Skill> iterator(){
		return new SkillIterator<Skill>(skills);
	}
	public List<Skill> getUsableSkill(){
		List<Skill> sk_list = new ArrayList<Skill>();
		Iterator<Skill> it = this.iterator();
		Skill sk = null;
		while(it.hasNext()){
			if((sk=it.next()).isUsing()){
				sk_list.add(sk);
			}
		}
		return sk_list;
	}
	
	public void addSkill(Skill skill){
		skills.add(skill);
	}
	public void useSkill(Skill skill) {
		for(Skill sk : skills){
			sk.setUsing(false);
		}
		if(skill.getReady()==0){
			skill.setUsing(true);
		}
	}
}

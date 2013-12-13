package com.test.util;

import java.util.Iterator;
import java.util.List;

public class SkillIterator<Skill> implements Iterator<Skill>{
	private List<Skill> skills;
	private int cursor;
	public SkillIterator(List<Skill> skills){
		this.skills = skills;
		this.cursor = skills.size()>0?skills.size()-1:0;
	}
	public boolean hasNext() {
		if(cursor != 0&&cursor<skills.size()-1){
			return true;
		}
		return false;
	}

	public Skill next() {
		return skills.get(cursor++);
	}

	public void remove() {
		skills.remove(cursor--);
	}

}

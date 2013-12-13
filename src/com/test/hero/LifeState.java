package com.test.hero;

public class LifeState {
	protected int blood;
	private boolean alive;
	public LifeState(){
		this.blood = 220;
		this.alive = true;
	}
	public int getBlood() {
		return blood>0?blood:0;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
	
	public void reduceBlood(int damage){
		this.setBlood(this.blood - damage);
	}
	
	public void addBlood(int blood){
		this.setBlood(this.blood + blood);
	}
	public boolean isAlive() {
		if(blood>0){
			alive = true;
		}else{
			alive = false;
		}
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}

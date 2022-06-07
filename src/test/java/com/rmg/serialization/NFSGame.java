package com.rmg.serialization;

import java.io.Serializable;

public class NFSGame implements Serializable {
	
	int level;
	String name;
	int life;
	long score;
	public NFSGame(int level, String name, int life, long score) {
		super();
		this.level = level;
		this.name = name;
		this.life = life;
		this.score = score;
	}
	
	

}

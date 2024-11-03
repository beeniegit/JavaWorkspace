package com.example.Nov03.Sample;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player extends Person {
	
	private team team;
	private position position;
	
	public Player(String name, int age, gender gender) {
		super(name, age, gender);
	}
	
	

}

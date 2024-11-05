package com.example.Nov04.Practice;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player extends Person {
	
	private Position position;
	private Integer number;
	private Team team;
	
	public Player(String name, Integer age, String birth, Integer weight, Integer height, Position position, Integer number, Team team) {
		super(name, age, birth, weight, height);
		this.position = position;
		this.number = number;
		this.team = team;
		
	}
	HashMap<String, Object> players = new HashMap<>();
	
	public HashMap<String, Object> getInfoHashMap(Type 타입) {
		if (타입 == Type.ALL) {
			return new HashMap<String, Object>();
		}
		else if (타입 == Type.PERSON) {
			return new HashMap<String, Object>();
		}
		else if (타입 == Type.PLAYER) {
			return new HashMap<String, Object>();
		}
		else {
			System.out.println("잘못된 타입 입력됨");
			return null;
		}
		
	}
	
	public Object getInfoObject(Type 타입) {
		if (타입 == Type.ALL) {
			return new AllInfo(name, age, birth, weight, height, position, number, team);
		}
		else if (타입 == Type.PERSON) {
			return new PersonInfo(name, age, birth, weight, height);
		}
		else if (타입 == Type.PLAYER) {
			return new PlayerInfo(position, number, team);
		}
		else {
			System.out.println("잘못된 타입 입력됨");
			return null;
		}
		
	}

}

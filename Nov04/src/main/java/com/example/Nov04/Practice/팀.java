package com.example.Nov04.Practice;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class 팀 {
	
	private String name;
	HashMap<String, Player> players = new HashMap<>();
	
	private Player findPlayer(String name) {
		try {
			Player foundplayer = players.get(name);
			return foundplayer;
		}
		catch (Exception e) {
			return null;
		}
		
	}

}

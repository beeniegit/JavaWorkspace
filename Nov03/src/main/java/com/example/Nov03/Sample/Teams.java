package com.example.Nov03.Sample;

import java.util.HashMap;

public class Teams {
	
	public HashMap<String, Player> players = new HashMap<>();
	
	public Player findMembers(String name) {
		try {
			Player foundplayer = players.get(name);
			return foundplayer;
		} catch (Exception e){
			System.out.println("없는 선수입니다");
			return null;	
		}
	}
	
	public int totalMembers() {
		return players.size();
	}

}

package com.example.Nov02.Practice;

import java.util.HashMap;
import java.util.Map;

public class Team { 
	
	Map<String, Player> PersonMap = new HashMap<>();
	
	public Player Find(String 이름) {
		try { 
			Player FoundPlayer = PersonMap.get(이름);
			return FoundPlayer;
			
		} catch (Exception e){
			System.out.println("없는 선수입니다.");
			return null;
		}
		
	}

}

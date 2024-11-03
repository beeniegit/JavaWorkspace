package com.example.Nov03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov03.Sample.*;

@SpringBootApplication
public class Nov03Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov03Application.class, args);
		practice();
	}
	
	public static void practice() {
		Teams 팀 = new Teams();
		
		Player 선수1 = new Player("해리 케인", 31, gender.man);
		선수1.setTeam(team.T1);
		선수1.setPosition(position.Top_laner);
		
		팀.players.put(선수1.getName(), 선수1);
		
		System.out.println(팀.totalMembers());
	}

}

package com.example.Nov04;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov04.Practice.Player;
import com.example.Nov04.Practice.Position;
import com.example.Nov04.Practice.Team;

@SpringBootApplication
public class Nov04Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov04Application.class, args);
		practice();
	}
	
	public static void practice() {
		
		Player 선수 = new Player("아몰랑", 20, "2003-07-13", 78, 186, Position.TOP, 7, Team.T1);
		
		선수.getPlayers().put(선수.getName(), 선수);
		
		for (Map.Entry<String, Object> entry : 선수.getPlayers().entrySet()) {
		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}

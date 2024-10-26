package com.beeniegit.Oct26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beeniegit.Oct26.Practice.선수정보;
import com.beeniegit.Oct26.Practice.정보;
import com.beeniegit.Oct26.Practice.축구선수;
import com.beeniegit.Oct26.Sample.INFO;
import com.beeniegit.Oct26.Sample.Person;
import com.beeniegit.Oct26.Sample.Physical;

@SpringBootApplication
public class Oct26Application {

	public static void main(String[] args) {
		SpringApplication.run(Oct26Application.class, args);
		
		sampleWorkspace();
		beenieWorkspace();
	}
	
	private static void sampleWorkspace() {
		Double weight = 72.5;
		Double height = 175.3;
		String name = "김도훈";
		String birth = "1996-10-07";
		int phone = 1027403581;
		double identification = 1122334;
		
		Person 김도훈 = new Person(weight, height, name, birth, phone, identification);
		
		Object 신체객체 = 김도훈.getInfo(INFO.PHYSICAL);
		Physical 신체정보 = (Physical) 신체객체;
		//System.out.println(신체정보.getHeight());
	}
	
	private static void beenieWorkspace() {
		Double 키 = 169.8;
		Double 몸무게 = 55.2;
		String 포지션 = "스트라이커";
		int 골 = 1;
		int 어시 = 50;
		
		축구선수 무명맨 = new 축구선수(키, 몸무게, 포지션, 골, 어시);
		
		Object 선수객체 = 무명맨.get정보(정보.선수);
		선수정보 선수맨 = (선수정보) 선수객체;
		System.out.println(선수맨.get골());
		
	}

}

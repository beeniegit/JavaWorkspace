package com.example.Oct27;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Oct27.Practice.Box;
import com.example.Oct27.Sample.Pair;
import com.example.Oct27.Sample.PairMap;


@SpringBootApplication
public class Oct27Application {

	public static void main(String[] args) {
		SpringApplication.run(Oct27Application.class, args);
		sample();
		practice();
	}
	
	private static void sample() {
		Pair 도훈 = new Pair("김도훈", 29);
		Pair 도빈 = new Pair("김도빈", 18);
		Pair 양희 = new Pair("김양희", "어머니");
		
		PairMap 가족 = new PairMap();
		가족.put("김도훈", 29);
		가족.put("김도빈", 18);
		가족.put("김양희", "어머니");
		
		//System.out.println(가족.get("김양희"));
		
	}
	
	private static void practice() {
		Box<Integer> IntegerBox = new Box<>();
		IntegerBox.set컨텐츠(1000);
		System.out.println(IntegerBox.get컨텐츠());
	}
	

}

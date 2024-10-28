package com.example.Oct28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Oct28.Practice.제네릭메서드;
import com.example.Oct28.Practice.책;
import com.example.Oct28.Practice.평점;

@SpringBootApplication
public class Oct28Application {

	public static void main(String[] args) {
		SpringApplication.run(Oct28Application.class, args);
		
		practice();
	}
	
	public static void practice() {
		제네릭메서드<Integer> intbox = new 제네릭메서드<>(10);
		제네릭메서드<Double> dblboox = new 제네릭메서드<>(5.5);
		
		System.out.println(intbox.doubleValue());
		
		책 책인턴 = new 책("해리 포터", "J.K.롤링", "블룸즈버리 퍼블리싱", "1");
		책인턴.addRating(4.5);  // double 타입 점수
        책인턴.addRating("김도빈");  // 리뷰어 이름 (String 타입)
        책인턴.addRating(new 평점(4.0, "밥아저씨")); // 평점 객체
        
        책인턴.printRatings();
		
	}
	
}

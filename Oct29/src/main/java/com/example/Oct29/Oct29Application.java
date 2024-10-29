package com.example.Oct29;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Oct29.연습.상품;
import com.example.Oct29.연습.상품상태;
import com.example.Oct29.연습.제네릭;
import com.example.Oct29.연습.제네릭인터페이스;

@SpringBootApplication
public class Oct29Application {

	public static void main(String[] args) {
		SpringApplication.run(Oct29Application.class, args);
		
		practice();
	}
	
	public static void practice() {
		제네릭인터페이스<String> processor = new 제네릭();
		 System.out.println(processor.process("hello world"));
		 
		// 상품 객체 생성
	    상품 상품1 = new 상품("마이쮸", 1200.0, 상품상태.판매중);
	    상품 상품2 = new 상품("빼빼로", 1800.0, 상품상태.품절);
	    
	    System.out.println(상품1); // toString() 메서드 호출
        System.out.println(상품2);
	    
	    
	}
	
	
	

}

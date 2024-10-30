package com.example.Oct30;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Oct30.Practice.*;

@SpringBootApplication
public class Oct30Application {

	public static void main(String[] args) {
		SpringApplication.run(Oct30Application.class, args);
		
		practice();
	}
	
	public static void practice() {
		계산<Integer> 숫자계산기 = new 계산기();
		System.out.println("계산 결과 = " + 숫자계산기.square(10));
		
		계산<Double> 소수점계산기 = new 계산기2();
		System.out.println("계산 결과 = " + 소수점계산기.square(1.1));
		
		BankAccount 인턴1 = new BankAccount("사과 씨",5000.0, AccountType.Savings);
		BankAccount 인턴2 = new BankAccount("밥 아저씨", 3000.0, AccountType.Checking);
		
		 System.out.println(인턴1);
	     System.out.println(인턴2);
		
	}

}

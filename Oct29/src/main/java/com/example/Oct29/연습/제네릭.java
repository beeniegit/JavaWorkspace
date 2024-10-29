package com.example.Oct29.연습;

public class 제네릭 implements 제네릭인터페이스<String> {
	@Override
	public String process(String input) {
		return input.toUpperCase();
	}
	

}

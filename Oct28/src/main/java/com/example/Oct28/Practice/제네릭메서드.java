package com.example.Oct28.Practice;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class 제네릭메서드<T extends Number> {
	
	private T number;
	
	 public double doubleValue() {
	        return number.doubleValue();
	 }
	
	
}

package com.example.Oct29.연습;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class 상품 {
	
	private String 이름;
	private double 가격;
	private 상품상태 상태;

	/**
	 * 
	 */
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        상품 product = (상품) obj;
        return Double.compare(product.가격, 가격) == 0 &&
               이름.equals(product.이름) &&
               상태 == product.상태;
    }
	/**
	 * 
	 */
    @Override
    public String toString() {
        return "Product{상품 이름 = '" + 이름 + "', 가격 = " + 가격 + ", 현재 상태 = " + 상태 + "}";
    }

   
    
} 

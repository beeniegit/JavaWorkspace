package com.example.Oct30.Practice;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Lombok 사용하여 은행 계좌 클래스 작성
@Getter
@AllArgsConstructor
public class BankAccount {
	private String accountHolder;   // 계좌 소유자 이름
	private double balance;         // 계좌 잔액
	private AccountType accountType; // 계좌 종류 (enum 타입)

 // 입금 메서드
	public void deposit(double amount) {
		if (amount > 0) {
	         balance += amount;
	         System.out.println(amount + " 입금되었습니다. 현재 잔액: " + balance);
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
 }

	// 출금 메서드
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
	         balance -= amount;
	         System.out.println(amount + " 출금되었습니다. 현재 잔액: " + balance);
		} else {
			System.out.println("잔액이 부족하거나 유효하지 않은 금액입니다.");
     }
 }

	// Object 타입을 파라미터로 받는 메서드 (equals 오버라이드)
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
	     BankAccount account = (BankAccount) obj;
	     return Double.compare(account.balance, balance) == 0 &&
	            accountHolder.equals(account.accountHolder) &&
	            accountType == account.accountType;
	 }
	
	 @Override
	 public String toString() {
	     return "BankAccount{accountHolder='" + accountHolder + "', balance=" + balance + ", accountType=" + accountType + "}";
	 }
	
	
	
	

}

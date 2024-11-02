package com.example.Nov01.Beenie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class 축구선수 implements AutoCloseable {
	
	private String 이름;
	private int 나이;
	private String 포지션;
	private int 등번호;
	
	@Override
	public void close() throws Exception {
		this.이름 = null;
		this.나이 = 0;
		this.포지션 = null;
		this.등번호 = 0;		
		
	}

}

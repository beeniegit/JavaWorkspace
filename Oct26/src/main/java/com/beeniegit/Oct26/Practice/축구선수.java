package com.beeniegit.Oct26.Practice;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor @Getter @Setter
public class 축구선수 {
	@NonNull
	private Double 키;
	@NonNull
	private Double 몸무게;
	
	@NonNull
	private String 포지션;
	@NonNull
	private int 골;
	@NonNull
	private int 어시;
	
	/**
	 * 정보를 받아서 해당 객체 반환함
	 * @param 인포
	 * @return
	 */
	public Object get정보(정보 인포) {
		if (인포 == 정보.신체) {
			return new 신체정보(키, 몸무게);
		}
		else if (인포 == 정보.선수) {
			return new 선수정보(포지션, 골, 어시);
		}
		else {
			return null;
		}
	}
	
	

}

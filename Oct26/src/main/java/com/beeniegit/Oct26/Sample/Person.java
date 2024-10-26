package com.beeniegit.Oct26.Sample;

import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor @Getter @Setter
public class Person {
	
	// PHYSICAL
	@NonNull
	private Double weight;
	@NonNull
	private Double height;
	
	// PERSONAL
	@NonNull
	private String name;
	@NonNull
	private String birth;
	@NonNull
	private int phone;
	@NonNull
	private Double identification;
	
	// STATUS
	private List<Disease> diseaseHist;
	private List<Injury> injuryHist;
	
	/**
	 * INFO enum 타입을 입력받아 해당하는 타입의 객체를 반환한다.
	 * PHYSICAL : 신체정보, PERSONAL : 신상정보, STATUS : 상태정보
	 * @param info
	 * @return
	 */
	public Object getInfo(INFO info) {
		if (info == INFO.PHYSICAL) {
			return new Physical(weight, height);
		} else if (info == INFO.PERSONAL) {
			return new Personal(name, birth, phone, identification);
		} else if (info == INFO.STATUS) {
			return new Status(diseaseHist, injuryHist);
		} else {
			return null;
		}
	}
	
}

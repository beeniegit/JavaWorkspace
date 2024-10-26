package com.beeniegit.Oct26.Sample;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class Status {
	private List<Disease> diseaseHist;
	private List<Injury> injuryHist;
}

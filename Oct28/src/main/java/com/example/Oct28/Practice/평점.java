package com.example.Oct28.Practice;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public class 평점 {
	
	@NonNull
    private final double score;
    @NonNull
    private final String reviewer;
    private final LocalDate date;

    public 평점(double score, String reviewer) {
        this.score = score;
        this.reviewer = reviewer;
        this.date = LocalDate.now();
    }

}

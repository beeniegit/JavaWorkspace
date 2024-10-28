package com.example.Oct28.Practice;


import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class 책 {
	
	
	// 기본 정보
    @NonNull
    private String title;
    @NonNull
    private String author;
    @NonNull
    private String publisher;
    @NonNull
    private String ISBN;
    
	private List<Object> ratings = new ArrayList<>();
	
	// 책 정보 반환
	public String getBookInfo() {
        return String.format("Title: %s, Author: %s, Publisher: %s, ISBN: %s", title, author, publisher, ISBN);
    }
	 /**
     * 새로운 평점을 추가합니다. 점수(double), 리뷰어(String), 날짜(LocalDate) 정보 등 다양한 타입을 추가할 수 있습니다.
     * @param ratingObject 평점 정보 객체
     */
    public void addRating(Object ratingObject) {
        ratings.add(ratingObject);
    }

    /**
     * 모든 평점 정보를 출력합니다. Object 타입이므로 instanceof 로 타입 체크하여 형 변환합니다.
     */
    public void printRatings() {
        for (Object rating : ratings) {
            if (rating instanceof Double) {
                System.out.println("Score: " + rating);
            } else if (rating instanceof String) {
                System.out.println("Reviewer: " + rating);
            } else if (rating instanceof 평점) {
                평점 r = (평점) rating;
                System.out.println("점수: " + r.getScore() + ", 평가: " + r.getReviewer() + ", 날짜: " + r.getDate());
            } else {
                System.out.println("이건 뭐야 다시해");
            }
        }
    }

}

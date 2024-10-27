package com.example.Oct27.Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class PairMap<K, V> {
	private List<Pair<K, V>> pairs;
 
	public PairMap() {
     pairs = new ArrayList<>();
 }

 // 새로운 Pair 추가 또는 값 갱신
	public void put(K key, V value) {
		 for (Pair<K, V> pair : pairs) {
			 if (pair.getKey().equals(key)) {
				 pair.setValue(value);
				 return;
			 }
		 }
		 pairs.add(new Pair<>(key, value));
	}

	 // 특정 키에 해당하는 값 반환
	 public V get(K key) {
	     for (Pair<K, V> pair : pairs) {
	         if (pair.getKey().equals(key)) {
	             return pair.getValue();
	         }
	     }
	     return null;  // 키가 없으면 null 반환
	 }
	
	 // 특정 키-값 쌍 제거
	 public void remove(K key) {
	     pairs.removeIf(pair -> pair.getKey().equals(key));
	 }
	
	 // 전체 Pair 목록 출력
	 public void printAll() {
	     for (Pair<K, V> pair : pairs) {
	         System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
	     }
	 }
}
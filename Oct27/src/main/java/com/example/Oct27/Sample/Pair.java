package com.example.Oct27.Sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Pair<K, V> {
    private K key;
    private V value;
}

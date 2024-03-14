package org.example;

public record Pair<K,V>(K k,V v) {
    public K getFirst(){
        return k;
    }
    public V getSecond(){
        return v;
    }
}

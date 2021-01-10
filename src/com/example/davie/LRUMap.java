package com.example.davie;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUMap<K,V> extends LinkedHashMap<K,V> {
    int cacheSize;
    public LRUMap(int size){
        super(size,0.75f,true);
        this.cacheSize = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }
}

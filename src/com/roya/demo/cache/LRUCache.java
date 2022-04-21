package com.roya.demo.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author royle
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int MAX_SIZE;

    public LRUCache(int maxSize) {
        super((int) (Math.ceil(maxSize/0.75)+1), 0.75f, true);
        MAX_SIZE = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>MAX_SIZE;
    }
}

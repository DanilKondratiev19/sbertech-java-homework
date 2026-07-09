package ru.study.day5;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static <K, V> Map<V, K> reverse(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();

        for (K key : map.keySet()) {
            V value = map.get(key);
            result.put(value, key);
        }

        return result;
    }
}

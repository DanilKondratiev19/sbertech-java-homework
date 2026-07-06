package ru.study.day5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map);

        Map<Integer, String> reversed = MapUtil.reverse(map);

        System.out.println(reversed);
    }
}

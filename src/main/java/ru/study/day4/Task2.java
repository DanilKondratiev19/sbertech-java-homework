package ru.study.day4;

import java.util.HashSet;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        int count = 1000000;

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            hashSet.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("HashSet add: " + (end - start) + " ms");

        start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            treeSet.add(i);
        }

        end = System.currentTimeMillis();

        System.out.println("TreeSet add: " + (end - start) + " ms");

        start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            hashSet.contains(i);
        }

        end = System.currentTimeMillis();

        System.out.println("HashSet get/contains: " + (end - start) + " ms");

        start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            treeSet.contains(i);
        }

        end = System.currentTimeMillis();

        System.out.println("TreeSet get/contains: " + (end - start) + " ms");
    }
}
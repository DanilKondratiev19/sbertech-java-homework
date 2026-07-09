package ru.study.day4;

public class Task1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("age", 21);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        pair.setKey("year");
        pair.setValue(2026);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
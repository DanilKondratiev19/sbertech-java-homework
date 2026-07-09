package ru.study.day8;

import java.util.List;

public class Task1 {

    public static void run() {
        List<String> lines = List.of(
                "I like Java",
                "Python is popular",
                "Java stream API",
                "C++ language",
                "java maven project"
        );

        String searchText = "java";

        lines.stream()
                .filter(line -> line.toLowerCase().contains(searchText))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

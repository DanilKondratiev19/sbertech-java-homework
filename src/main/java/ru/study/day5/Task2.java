package ru.study.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> words = new HashMap<>();

        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String word = scanner.next();

            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }

        for (String word : words.keySet()) {
            System.out.println(word + " = " + words.get(word));
        }
    }
}

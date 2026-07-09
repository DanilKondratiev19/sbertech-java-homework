package ru.study.day1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 100: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 100) {
            System.out.println("Число должно быть от 1 до 100.");
            return;
        }

        while (number >= 100) {
            System.out.print("C");
            number -= 100;
        }

        while (number >= 90) {
            System.out.print("XC");
            number -= 90;
        }

        while (number >= 50) {
            System.out.print("L");
            number -= 50;
        }

        while (number >= 40) {
            System.out.print("XL");
            number -= 40;
        }

        while (number >= 10) {
            System.out.print("X");
            number -= 10;
        }

        while (number >= 9) {
            System.out.print("IX");
            number -= 9;
        }

        while (number >= 5) {
            System.out.print("V");
            number -= 5;
        }

        while (number >= 4) {
            System.out.print("IV");
            number -= 4;
        }

        while (number >= 1) {
            System.out.print("I");
            number -= 1;
        }
    }
}
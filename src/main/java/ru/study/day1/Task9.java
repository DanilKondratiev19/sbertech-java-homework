package ru.study.day1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Два корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);

            System.out.println("Один корень:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}
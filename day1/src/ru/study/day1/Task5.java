package ru.study.day1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        System.out.println("Введите вес пользователя: ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        double weight = result * 0.17;
        System.out.printf("Исходный вес на луне будет равен %f",weight);
    }
}

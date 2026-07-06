package ru.study.day1;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение ");
        int x = scanner.nextInt();
        System.out.println("Введите второе значение ");
        int y = scanner.nextInt();
        int remainder = x % y;
        int div = x / y ;
        System.out.printf("Деление %d / %d = %d", x, y,div);
        System.out.printf(" Остаток от деления = %d ", remainder);
    }
}

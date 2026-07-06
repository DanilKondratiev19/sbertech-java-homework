package ru.study.day1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        Boolean isSymple = true;
        for (int i = 2; i*i<=Number; i++) {
            if (Number % i == 0){
                isSymple = false;
                break;
            }
        }
        if (isSymple){
            System.out.println("Число простое");
        }
        else{
            System.out.println("Не простое");
        }
    }
}

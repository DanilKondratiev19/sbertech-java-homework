package ru.study.day1;
import java.util.Scanner;
import java.util.ArrayList;
public class Task7 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int newNumber = 0;
        for (int i = 0; i <= n-3; i++) {
            newNumber = numbers.get(i)+numbers.get(i+1);
            numbers.add(newNumber);
        }
        System.out.println(numbers);
    }
}

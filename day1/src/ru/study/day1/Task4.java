package ru.study.day1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение n ");
        int n = scanner.nextInt();
        int firstnumber = n/100;
        int secondnumber = (n/10)%10;
        int thirdnumber = n%10;
//        System.out.println(firstnumber);
//        System.out.println(secondnumber);
//        System.out.println(thirdnumber);
        int sumOfnumber = firstnumber + secondnumber + thirdnumber;
        System.out.println("Сумма цифр = "+ sumOfnumber);
    }
}

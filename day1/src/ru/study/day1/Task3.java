package ru.study.day1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scannerline = new Scanner(System.in);
        System.out.println("Введите число ");
        String number = scannerline.nextLine();

        String reversedNumber = "";
        for (int i = number.length() - 1; i >= 0 ; i--) {
            reversedNumber += number.charAt(i);
        }
        int lenOFnumber= number.length();
        int count = 0;
        System.out.printf("Вывод перевернутой строки %s ", reversedNumber);
        for(int i = 0; i <= number.length() - 1; i++){
            if (number.charAt(i) == reversedNumber.charAt(i)) {
                count++;
            }
        }
        System.out.println(lenOFnumber);
        System.out.println(count);
        if (count == lenOFnumber){
            System.out.println("Число является полиндромом");
        }
        else {
            System.out.println("Число не является полиндромом");}
    }
}

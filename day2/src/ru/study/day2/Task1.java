package ru.study.day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String phoneOfuser = scanner.nextLine();
        Phone phone = new Phone("89210570998", "16pro",2);
        String num = phone.getNumber();
        System.out.println(num);



        Phone phone2 = new Phone();

        String[] numbers = {
                "+79991112233",
                "+79994445566",
                "+79997778899"
        };

        phone2.sendMessage(numbers);
        System.out.println(phone2);
    }
}


package ru.study.day1;
import java.util.Scanner;
import java.util.Random;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char randomLetter = (char) (random.nextInt(26)+65);
//        System.out.println(randomLetter);




        while (true){
            System.out.println("Угадайте букву ");
            String input = scanner.next().toUpperCase();
            char letter = input.charAt(0);
            int number= (int) letter;

            if(number == (int) randomLetter){
                System.out.println("Вы угадали !!!!");
                break;
            }
            else if (number > (int) randomLetter){
                System.out.println("ввел букву больше загаданной");
            }
            else {
                System.out.println("ввел букву меньше загаданной");
            }
        }

    }
}

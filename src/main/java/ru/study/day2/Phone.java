package ru.study.day2;

public class Phone {
    public String number;
    public String model;
    public int weight;

    public Phone() {
        this.number = "+79210570998";
        this.model = "Айфон";
        this.weight = 0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Вам звонит " + name);
    }

    public String getNumber() {
        return number;
    }
    public void receiveCall(String name, String number) {
        System.out.println("Вам звонит " + name);
        System.out.println("Номер телефона: " + number);
    }
    public void sendMessage(String[] numbers) {
        System.out.println("Сообщение будет отправлено на номера:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public String toString() {
        return "Номер: " + number +
                ", Модель: " + model +
                ", Вес: " + weight;
    }
}
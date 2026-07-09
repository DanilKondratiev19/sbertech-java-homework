package ru.study.day2;

public class Task5 {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder("Аль-Капчоне", PizzaSize.BIG, true, "Ярославская 101");

        order.order();
        order.order();

        order.cancel();
        order.cancel();
    }
}
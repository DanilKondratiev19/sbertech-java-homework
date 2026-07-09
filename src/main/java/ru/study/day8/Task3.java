package ru.study.day8;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Task3 {

    public static void run() {
        List<Order> orders = List.of(
                new Order(1, 1500.0, LocalDate.of(2026, 7, 1)),
                new Order(2, 3200.0, LocalDate.of(2026, 7, 5)),
                new Order(3, 700.0, LocalDate.of(2026, 6, 20)),
                new Order(4, 5200.0, LocalDate.of(2026, 7, 12)),
                new Order(5, 1100.0, LocalDate.of(2026, 8, 3))
        );

        Order maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getAmount))
                .orElse(null);

        Order minOrder = orders.stream()
                .min(Comparator.comparingDouble(Order::getAmount))
                .orElse(null);

        int month = 7;

        double monthSum = orders.stream()
                .filter(order -> order.getDate().getMonthValue() == month)
                .mapToDouble(Order::getAmount)
                .sum();

        System.out.println("Заказ с максимальной суммой: " + maxOrder);
        System.out.println("Заказ с минимальной суммой: " + minOrder);
        System.out.println("Сумма заказов за месяц " + month + ": " + monthSum);
    }
}

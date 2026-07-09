package ru.study.day8;

import java.time.LocalDate;

public class Order {

    private int id;
    private double amount;
    private LocalDate date;

    public Order(int id, double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", amount=" + amount + ", date=" + date + '}';
    }
}

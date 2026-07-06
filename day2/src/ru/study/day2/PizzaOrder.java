package ru.study.day2;

public class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean sauce;
    private String address;
    private boolean accepted;

    public PizzaOrder(String name, PizzaSize size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.accepted = false;
    }

    public void order() {
        if (accepted) {
            System.out.println("Заказ уже принят.");
        } else {
            accepted = true;
            System.out.println("Заказ принят.");
            System.out.println(this);
        }
    }

    public void cancel() {
        if (accepted) {
            accepted = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String sauceText;

        if (sauce) {
            sauceText = "с соусом";
        } else {
            sauceText = "без соуса";
        }

        return "Пицца: " + name +  ", размер: " + size +  ", " + sauceText + ", адрес: " + address;
    }
}
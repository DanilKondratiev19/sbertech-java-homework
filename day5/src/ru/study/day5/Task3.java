package ru.study.day5;

public class Task3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(3);

        list.add("A");
        list.add("B");
        list.add(1, "C");

        list.print();

        System.out.println("Размер: " + list.size());
        System.out.println("Элемент 1: " + list.get(1));

        list.remove(1);
        list.print();

        // list.get(10);
        // list.add("D");
        // list.add("E");
    }
}

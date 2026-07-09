package ru.study.day5;

public class LinkedList {
    private Node root;
    private int size;
    private int maxSize;

    public LinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(Object value) {
        if (size >= maxSize) {
            throw new ListSizeException("Превышен максимальный размер списка");
        }

        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void add(int index, Object value) {
        if (size >= maxSize) {
            throw new ListSizeException("Превышен максимальный размер списка");
        }

        if (index < 0 || index > size) {
            throw new ListIndexException("Неверный индекс");
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = root;
            root = newNode;
        } else {
            Node current = root;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ListIndexException("Такого элемента нет");
        }

        Node current = root;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ListIndexException("Нельзя удалить элемент: индекс неверный");
        }

        if (index == 0) {
            root = root.next;
        } else {
            Node current = root;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node current = root;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}

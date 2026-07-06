package ru.study.day2;

public class Task4 {
    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", "Мужской", "tolstoy@gmail.ru");
        Book book = new Book("Война и мир", author, 1869);

        System.out.println(book);

        book.setYear(1870);
        System.out.println(book);
    }
}
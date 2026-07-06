package ru.study.day4;

public abstract class Figure implements Drawable {
    public Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract double area();

    public abstract double perimeter();
}
package ru.study.day2;

public class Circle {
    public double radius;
    public String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Радиус: " + radius +
                ", цвет: " + color +
                ", площадь: " + area() +
                ", периметр: " + perimeter();
    }
}
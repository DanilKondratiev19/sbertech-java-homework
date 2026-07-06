package ru.study.day4;

public class Triangle extends Figure {
    public double a;
    public double b;
    public double c;

    public Triangle(Point point, double a, double b, double c) {
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    public void draw() {
        System.out.println("Нарисован треугольник черного цвета с координатой " + point);
    }

    public void draw(Color color) {
        System.out.println("Нарисован треугольник цвета " + color + " с координатой " + point);
    }
}
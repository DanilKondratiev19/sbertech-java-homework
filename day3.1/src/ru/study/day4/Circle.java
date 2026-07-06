package ru.study.day4;

public class Circle extends Figure {
    public double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        System.out.println("Нарисован круг черного цвета с координатой " + point);
    }

    public void draw(Color color) {
        System.out.println("Нарисован круг цвета " + color + " с координатой " + point);
    }
}
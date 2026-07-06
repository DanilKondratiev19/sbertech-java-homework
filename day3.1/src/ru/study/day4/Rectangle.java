package ru.study.day4;

public class Rectangle extends Figure {
    public double width;
    public double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void draw() {
        System.out.println("Нарисован прямоугольник черного цвета с координатой " + point);
    }

    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник цвета " + color + " с координатой " + point);
    }
}
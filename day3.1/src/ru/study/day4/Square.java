package ru.study.day4;

public class Square extends Rectangle {

    public Square(Point point, double side) {
        super(point, side, side);
    }

    public void draw() {
        System.out.println("Нарисован квадрат черного цвета с координатой " + point);
    }

    public void draw(Color color) {
        System.out.println("Нарисован квадрат цвета " + color + " с координатой " + point);
    }
}
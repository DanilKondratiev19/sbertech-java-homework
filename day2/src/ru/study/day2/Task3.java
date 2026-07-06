package ru.study.day2;

public class Task3 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(1, 0, 3);
        m1.setValue(1, 1, 4);

        m2.setValue(0, 0, 5);
        m2.setValue(0, 1, 6);
        m2.setValue(1, 0, 7);
        m2.setValue(1, 1, 8);

        System.out.println("Первая матрица: ");
        m1.print();

        System.out.println("Сложение: ");
        Matrix sum = m1.add(m2);
        sum.print();

        System.out.println("Умножение на число: ");
        Matrix multipliedByNumber = m1.multiplyByNumber(2);
        multipliedByNumber.print();

        System.out.println("Умножение матриц:" );
        Matrix result = m1.multiply(m2);
        result.print();
    }
}
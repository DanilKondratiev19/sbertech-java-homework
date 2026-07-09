package ru.study.day2;

public class Matrix {
    public double[][] values;
    public int rows;
    public int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.values = new double[rows][columns];
    }

    public void setValue(int i, int j, int value) {
        values[i][j] = value;
    }

    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.values[i][j] = values[i][j] + other.values[i][j];
            }
        }

        return result;
    }

    public Matrix multiplyByNumber(double number) {
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.values[i][j] = values[i][j] * number;
            }
        }

        return result;
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(rows, other.columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result.values[i][j] += values[i][k] * other.values[k][j];
                }
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
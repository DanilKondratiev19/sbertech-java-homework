package ru.study.day6;

public class Animal {
    private String name;
    private int age;
    private String type;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}

package ru.study.day7;

import java.io.Serializable;

public class Armor implements Serializable {

    private String name;
    private int protection;

    public Armor(String name, int protection) {
        this.name = name;
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "name='" + name + '\'' +
                ", protection=" + protection +
                '}';
    }
}
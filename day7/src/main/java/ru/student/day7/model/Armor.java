package ru.student.day7.model;

import java.io.Serializable;

public class Armor implements Serializable {
    private String name;
    private int defence;

    public Armor(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return "Armor{name='" + name + "', defence=" + defence + "}";
    }
}

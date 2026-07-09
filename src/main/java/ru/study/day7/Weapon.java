package ru.study.day7;

import java.io.Serializable;

public class Weapon implements Serializable {

    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
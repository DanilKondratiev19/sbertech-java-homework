package ru.study.day7;

import java.io.Serializable;

public class Hero implements Serializable {

    private String name;
    private int lvl;
    private Weapon weapon;
    private Armor armor;

    public Hero(String name, int lvl, Weapon weapon, Armor armor) {
        this.name = name;
        this.lvl = lvl;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
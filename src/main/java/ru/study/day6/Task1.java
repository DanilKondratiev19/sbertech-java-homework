package ru.study.day6;

public class Task1 {
    public static void main(String[] args) {
        Pet pet = new Pet("Барсик", 3, "Кот");

        Animal animal = PetConverter.convert(pet);

        System.out.println("Исходный объект Pet:");
        System.out.println(pet);

        System.out.println("\nОбъект Animal после конвертации через Reflection:");
        System.out.println(animal);
    }
}

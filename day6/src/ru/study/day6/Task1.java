package ru.study.day6;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Pet pet = new Pet("Барсик", 3, "Кот");

        Animal animal = PetConverter.convert(pet);

        System.out.println(animal);
    }
}

package ru.study.day6;

import java.lang.reflect.Field;

public class PetConverter {

    public static Animal convert(Pet pet) {
        Animal animal = new Animal();

        Field[] petFields = Pet.class.getDeclaredFields();

        for (Field petField : petFields) {
            try {
                petField.setAccessible(true);

                Field animalField = Animal.class.getDeclaredField(petField.getName());
                animalField.setAccessible(true);

                Object value = petField.get(pet);
                animalField.set(animal, value);
            } catch (NoSuchFieldException e) {
                System.out.println("В Animal нет поля: " + petField.getName());
            } catch (IllegalAccessException e) {
                System.out.println("Нет доступа к полю: " + petField.getName());
            }
        }

        return animal;
    }
}

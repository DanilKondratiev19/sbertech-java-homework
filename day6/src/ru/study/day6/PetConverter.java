package ru.study.day6;

import java.lang.reflect.Field;

public class PetConverter {

    public static Animal convert(Pet pet) throws Exception {
        Animal animal = new Animal();

        Class<?> petClass = pet.getClass();
        Class<?> animalClass = animal.getClass();

        Field[] petFields = petClass.getDeclaredFields();

        for (Field petField : petFields) {
            petField.setAccessible(true);

            Field animalField = animalClass.getDeclaredField(petField.getName());
            animalField.setAccessible(true);

            animalField.set(animal, petField.get(pet));
        }

        return animal;
    }
}

package ru.student.day7;

import ru.student.day7.model.Armor;
import ru.student.day7.model.Hero;
import ru.student.day7.model.Weapon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path outputDirectory = Path.of("output");
        Files.createDirectories(outputDirectory);

        removeExtraSpaces(
                Path.of("src/main/resources/Borodino.txt"),
                outputDirectory.resolve("BorodinoClean.txt")
        );

        sortNames(
                Path.of("src/main/resources/listNames.txt"),
                outputDirectory.resolve("sortedNames.txt")
        );

        saveAndLoadHero(outputDirectory.resolve("hero.dat"));
    }

    private static void removeExtraSpaces(Path inputFile, Path outputFile) throws IOException {
        List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

        List<String> cleanedLines = lines.stream()
                .map(line -> line.trim().replaceAll("\\s+", " "))
                .toList();

        Files.write(outputFile, cleanedLines, StandardCharsets.UTF_8);

        System.out.println("Задача 1 выполнена: " + outputFile);
    }

    private static void sortNames(Path inputFile, Path outputFile) throws IOException {
        String text = Files.readString(inputFile, StandardCharsets.UTF_8);

        List<String> names = Arrays.stream(text.split(","))
                .map(String::trim)
                .sorted()
                .toList();

        Files.write(outputFile, names, StandardCharsets.UTF_8);

        System.out.println("Задача 2 выполнена: " + outputFile);
    }

    private static void saveAndLoadHero(Path heroFile) throws IOException, ClassNotFoundException {
        Hero hero = new Hero(
                "Артур",
                15,
                new Weapon("Меч", 35),
                new Armor("Железная броня", 20)
        );

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(heroFile.toFile()))) {
            outputStream.writeObject(hero);
        }

        Hero loadedHero;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(heroFile.toFile()))) {
            loadedHero = (Hero) inputStream.readObject();
        }

        System.out.println("Задача 3 выполнена: объект сохранён и загружен обратно");
        System.out.println("Загруженный объект: " + loadedHero);
        System.out.println("Имя героя: " + loadedHero.getName());
        System.out.println("Уровень героя: " + loadedHero.getLvl());
        System.out.println("Оружие героя: " + loadedHero.getWeapon());
        System.out.println("Броня героя: " + loadedHero.getArmor());
    }
}

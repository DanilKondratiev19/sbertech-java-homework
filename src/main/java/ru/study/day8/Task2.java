package ru.study.day8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {

    public static void run() {
        List<Student> students = List.of(
                new Student("Анна", 18, 1),
                new Student("Иван", 19, 1),
                new Student("Мария", 20, 2),
                new Student("Сергей", 21, 2),
                new Student("Павел", 22, 3)
        );

        Map<Integer, Double> averageAgeByCourse = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                        Collectors.averagingInt(Student::getAge)
                ));

        averageAgeByCourse.forEach((course, averageAge) ->
                System.out.println("Курс: " + course + ", средний возраст: " + averageAge)
        );
    }
}

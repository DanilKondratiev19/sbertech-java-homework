package ru.study.day6;

@Paint(style = "arrow", color = Colors.RED)
public class Messages {

    @Paint(style = "hurray", color = Colors.PURPLE)
    public String happyBirthday() {
        return "С днём рождения!";
    }

    @Paint(style = "!", color = Colors.YELLOW)
    public String warning() {
        return "Предупреждение";
    }

    public String error() {
        return "Ошибка";
    }
}

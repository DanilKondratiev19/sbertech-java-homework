# ДЗ день 6 — Maven, Reflection, Annotation

## Для чего нужен Maven

Maven — это инструмент сборки Java-проектов.

Он нужен, чтобы:

1. хранить настройки проекта в одном файле `pom.xml`;
2. автоматически компилировать Java-код;
3. подключать внешние библиотеки;
4. запускать тесты;
5. собирать готовый `.jar` файл;
6. проверять проект одной командой.

Главная команда для проверки проекта:

```bash
mvn install
```

Если в конце написано:

```text
BUILD SUCCESS
```

значит проект собрался правильно.

## Структура проекта

```text
day6-maven
├── pom.xml
└── src
    └── main
        └── java
            └── ru
                └── study
                    └── day6
                        ├── Animal.java
                        ├── Colors.java
                        ├── Main.java
                        ├── Messages.java
                        ├── Paint.java
                        ├── PaintPrinter.java
                        ├── Pet.java
                        ├── PetConverter.java
                        ├── Task1.java
                        └── Task2.java
```

Maven по умолчанию ищет код именно в папке:

```text
src/main/java
```

Поэтому классы нельзя оставлять просто в `src/ru.study.day6`.

## Task1 — Reflection

Задание: преобразовать объект `Pet` в объект `Animal` через Reflection.

В классах `Pet` и `Animal` есть одинаковые поля:

```java
private String name;
private int age;
private String type;
```

Поля private, поэтому напрямую обратиться к ним нельзя.

Reflection позволяет получить доступ к полям класса во время выполнения программы.

В классе `PetConverter` программа:

1. создаёт новый объект `Animal`;
2. получает все поля класса `Pet`;
3. для каждого поля ищет поле с таким же названием в `Animal`;
4. открывает доступ через `setAccessible(true)`;
5. берёт значение из `Pet`;
6. записывает это значение в `Animal`.

## Task2 — Annotation

Аннотация — это специальная метка для класса, метода или поля.

В проекте создана аннотация:

```java
@Paint(style = "arrow", color = Colors.RED)
```

Она хранит два значения:

1. `style` — стиль вывода текста;
2. `color` — цвет текста.

Аннотация может применяться к классу и методу.

Если аннотация есть и на классе, и на методе, приоритет у метода.

Это реализовано в `PaintPrinter`:

```java
Paint resultPaint = methodPaint != null ? methodPaint : classPaint;
```

То есть:

1. если у метода есть своя аннотация — берём её;
2. если у метода нет аннотации — берём аннотацию класса;
3. если аннотации нет нигде — выводим обычный текст.

## Команды

Собрать проект:

```bash
mvn install
```

Запустить программу:

```bash
mvn exec:java
```

Запустить только Task1:

```bash
mvn exec:java -Dexec.mainClass="ru.study.day6.Task1"
```

Запустить только Task2:

```bash
mvn exec:java -Dexec.mainClass="ru.study.day6.Task2"
```

## Как запушить в GitHub

Из корня общего репозитория:

```bash
git add day6-maven
git commit -m "Add day 6 Maven reflection annotation homework"
git push
```

Если папку нужно назвать просто `day6`, переименуйте её перед добавлением в Git.

package ru.study.day6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PaintPrinter {

    public static void print(Object object) {
        Class<?> clazz = object.getClass();
        Paint classPaint = clazz.getAnnotation(Paint.class);

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getParameterCount() != 0 || method.getReturnType() != String.class) {
                continue;
            }

            Paint methodPaint = method.getAnnotation(Paint.class);
            Paint resultPaint = methodPaint != null ? methodPaint : classPaint;

            try {
                method.setAccessible(true);
                String text = (String) method.invoke(object);

                if (resultPaint == null) {
                    System.out.println(text);
                } else {
                    System.out.println(resultPaint.color() + applyStyle(text, resultPaint.style()) + Colors.RESET);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println("Не удалось вызвать метод: " + method.getName());
            }
        }
    }

    private static String applyStyle(String text, String style) {
        return switch (style) {
            case "arrow" -> "-> " + text;
            case "hurray" -> "!!! " + text + " !!!";
            case "!" -> text + "!";
            default -> text;
        };
    }
}

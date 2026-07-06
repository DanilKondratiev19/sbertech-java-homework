package ru.study.day6;

import java.lang.reflect.Method;

public class PaintPrinter {

    public static void print(Object object) throws Exception {
        Class<?> objectClass = object.getClass();

        Paint classPaint = objectClass.getAnnotation(Paint.class);

        Method[] methods = objectClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getReturnType() == String.class) {
                Paint paint = method.getAnnotation(Paint.class);

                if (paint == null) {
                    paint = classPaint;
                }

                String text = (String) method.invoke(object);

                if (paint != null) {
                    System.out.println(paint.color() + applyStyle(text, paint.style()) + Colors.RESET);
                } else {
                    System.out.println(text);
                }
            }
        }
    }

    private static String applyStyle(String text, String style) {
        if (style.equals("arrow")) {
            return "-> " + text;
        }

        if (style.equals("hurray")) {
            return "!!! " + text + " !!!";
        }

        if (style.equals("!")) {
            return "! " + text + " !";
        }

        return text;
    }
}

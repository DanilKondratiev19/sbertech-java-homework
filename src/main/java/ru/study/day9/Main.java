package ru.study.day9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static final int CARS_COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        CountDownLatch readyLatch = new CountDownLatch(CARS_COUNT);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch finishLatch = new CountDownLatch(CARS_COUNT);

        AtomicBoolean winnerExists = new AtomicBoolean(false);

        Race race = new Race(
                new Road(60),
                new Tunnel(CARS_COUNT),
                new Road(40)
        );

        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(
                    race,
                    20 + (int) (Math.random() * 10),
                    readyLatch,
                    startLatch,
                    finishLatch,
                    winnerExists
            );
        }

        for (Car car : cars) {
            new Thread(car).start();
        }

        readyLatch.await();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        startLatch.countDown();

        finishLatch.await();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}
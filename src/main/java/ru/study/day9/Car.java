package ru.study.day9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {

    private static int carsCount = 0;

    private final Race race;
    private final int speed;
    private final String name;

    private final CountDownLatch readyLatch;
    private final CountDownLatch startLatch;
    private final CountDownLatch finishLatch;
    private final AtomicBoolean winnerExists;

    public Car(
            Race race,
            int speed,
            CountDownLatch readyLatch,
            CountDownLatch startLatch,
            CountDownLatch finishLatch,
            AtomicBoolean winnerExists
    ) {
        this.race = race;
        this.speed = speed;

        carsCount++;
        this.name = "Участник #" + carsCount;

        this.readyLatch = readyLatch;
        this.startLatch = startLatch;
        this.finishLatch = finishLatch;
        this.winnerExists = winnerExists;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(name + " готов");

            readyLatch.countDown();

            startLatch.await();

            for (Stage stage : race.getStages()) {
                stage.go(this);
            }

            if (winnerExists.compareAndSet(false, true)) {
                System.out.println(name + " - WIN");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            finishLatch.countDown();
        }
    }
}
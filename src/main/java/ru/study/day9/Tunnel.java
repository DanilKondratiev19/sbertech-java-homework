package ru.study.day9;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    private final Semaphore semaphore;

    public Tunnel(int carsCount) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";

        int maxCarsInTunnel = carsCount / 2;
        this.semaphore = new Semaphore(maxCarsInTunnel);
    }

    @Override
    public void go(Car car) {
        try {
            System.out.println(car.getName() + " готовится к этапу(ждет): " + description);

            semaphore.acquire();

            System.out.println(car.getName() + " начал этап: " + description);
            Thread.sleep(length / car.getSpeed() * 1000L);
            System.out.println(car.getName() + " закончил этап: " + description);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
package com.smoothstack.dayfour.assignmentthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProduceConsume {

    private List<Integer> list;

    public ProduceConsume() {
        list = new ArrayList<>();
    }

    public void produce() throws InterruptedException {
        Random random = new Random();
        while (true) {
            synchronized (this) {
                while (list.size() >= 3) {
                    wait();
                }
                int value = random.nextInt();
                System.out.println("Produced value: " + value);
                list.add(value);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                }
                int value = list.remove(0);
                System.out.println("Consumed value: " + value);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        ProduceConsume pc = new ProduceConsume();

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

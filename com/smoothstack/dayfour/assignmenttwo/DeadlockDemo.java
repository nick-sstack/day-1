package com.smoothstack.dayfour.assignmenttwo;

public class DeadlockDemo {

    private int i;

    public DeadlockDemo() {
        this.i = 0;
    }

    public synchronized void setI(int i) {
        System.out.println("Updating i.");
        this.i = i;
    }

    public synchronized void print() {
        while (i == 0) {
            try {
                System.out.println("Waiting for i to update.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Ended.");
    }


    public static void main(String[] args) {
        DeadlockDemo dld = new DeadlockDemo();
        Thread t1 = new Thread() {
            public void run() {
                dld.print();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dld.setI(1);
                dld.print();
            }
        };

        t1.start();
        t2.start();
    }
}

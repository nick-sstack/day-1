package com.smoothstack.dayfour.assignmentone;

public class SingletonDemo {

    private static volatile SingletonDemo instance = null;

    private SingletonDemo() {
    }

    public SingletonDemo getInstance() {
        SingletonDemo localRef = instance;
        if (localRef == null) {
            synchronized (this) {
                localRef = instance;
                if (localRef == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return localRef;
    }
}

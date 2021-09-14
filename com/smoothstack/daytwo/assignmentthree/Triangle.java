package com.smoothstack.daytwo.assignmentthree;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return .5 * base * height;
    }

    @Override
    public void display() {
        System.out.printf("Triangle has a height of %.2f and a base of %.2f with an area of %.2f\n", height, base, calculateArea());
    }
}

package com.smoothstack.daytwo.assignmentthree;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void display() {
        System.out.printf("Circle has a radius of %.2f with an area of %.2f\n", radius, calculateArea());
    }
}

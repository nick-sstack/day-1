package com.smoothstack.daytwo.assignmentthree;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void display() {
        System.out.printf("Rectangle has a height of %.2f and a width of %.2f with an area of %.2f\n", height, width, calculateArea());
    }
}

package com.smoothstack.daytwo.assignmentthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape> shapes = new ArrayList<>();
        Shape triangle = new Triangle(random.nextInt(10000) + 1, random.nextInt(10000) + 1);
        shapes.add(triangle);
        Shape circle = new Circle(random.nextInt(10000) + 1);
        shapes.add(circle);
        Shape rectangle = new Rectangle(random.nextInt(10000) + 1, random.nextInt(10000) + 1);
        shapes.add(rectangle);

        for (Shape s : shapes) {
            s.display();
        }
    }
}

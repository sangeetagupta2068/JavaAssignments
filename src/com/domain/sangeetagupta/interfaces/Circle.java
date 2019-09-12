package com.domain.sangeetagupta.interfaces;

public class Circle extends Shape {
    private int radius;

    public Circle(){ radius = 2;}
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}

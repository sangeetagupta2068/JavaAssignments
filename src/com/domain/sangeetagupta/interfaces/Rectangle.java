package com.domain.sangeetagupta.interfaces;

public class Rectangle extends Shape {

    private int length;
    private int height;

    public Rectangle(){length = 2; height = 3;}
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn!");
    }
}

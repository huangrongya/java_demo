package com.roya.demo.designPattern.structral.flyweight;

public class Circle implements Shape {
    String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("draw a circle, and the color is "+color);
    }
}

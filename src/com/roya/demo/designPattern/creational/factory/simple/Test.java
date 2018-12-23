package com.roya.demo.designPattern.creational.factory.simple;

public class Test {
    public static void main(String[] args) {
        Shape circle = Factory.getShape(Circle.class);
        circle.draw();

        Shape rectangle = Factory.getShape(Rectangle.class);
        rectangle.draw();
    }
}

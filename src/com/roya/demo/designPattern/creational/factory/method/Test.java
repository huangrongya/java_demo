package com.roya.demo.designPattern.creational.factory.method;

public class Test {
    public static void main(String[] args) {
        CircleFactory factory = new CircleFactory();
        Shape circle = factory.getShape();
        circle.draw();
    }
}

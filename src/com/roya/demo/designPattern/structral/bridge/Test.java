package com.roya.demo.designPattern.structral.bridge;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.draw();
    }
}

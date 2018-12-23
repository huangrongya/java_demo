package com.roya.demo.designPattern.creational.factory.method;

public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}

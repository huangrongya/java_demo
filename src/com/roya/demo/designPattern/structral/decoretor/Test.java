package com.roya.demo.designPattern.structral.decoretor;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        ShapeDecorator decorator = new RedShapeDecorator(shape);
        decorator.draw();
    }
}

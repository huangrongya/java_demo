package com.roya.demo.designPattern.decoretor;

public class Test {

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        ShapeDecorator decorator = new RedShapeDecorator(shape);
        decorator.draw();
    }
}

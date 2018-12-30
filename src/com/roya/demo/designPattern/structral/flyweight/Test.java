package com.roya.demo.designPattern.structral.flyweight;

public class Test {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("red").draw();
        factory.getShape("black").draw();
        factory.getShape("blue").draw();
        factory.getShape("green").draw();
        factory.getShape("red").draw();
        factory.getShape("blue").draw();
        factory.getShape("red").draw();

        System.out.println("共画了"+factory.SUM+"个圆");
        System.out.println("共产生了"+factory.SUM_OBJECT+"个对象");
    }
}

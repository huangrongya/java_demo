package com.roya.demo.designPattern.structral.bridge;

/**
 * @author Royle.Huang
 * @date 2018/12/30 11:59
 * @description: 具体实现化角色 Concrete Implementor 圆
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        color.paint();
        System.out.println("circle");
    }
}

package com.roya.demo.designPattern.structral.bridge;

/**
 * @author Royle.Huang
 * @date 2018/12/30 12:04
 * @description: 具体实现化角色
 */
public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        color.paint();
        System.out.println("rectangle");
    }
}

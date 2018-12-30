package com.roya.demo.designPattern.structral.bridge;

/**
 * @author Royle.Huang
 * @date 2018/12/30 11:58
 * @description: 实现化角色 implementor 形状
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

package com.roya.demo.designPattern.creational.factory.simple;

public class Factory {
    public static Shape getShape(Class<? extends Shape> clazz){
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shape;
    }
}

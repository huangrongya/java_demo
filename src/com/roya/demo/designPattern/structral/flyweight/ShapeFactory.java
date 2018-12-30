package com.roya.demo.designPattern.structral.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class ShapeFactory {
    public int SUM=0;
    public int SUM_OBJECT=0;
    public static ConcurrentHashMap<String, Shape> map = new ConcurrentHashMap<String, Shape>();
    public Shape getShape(String color){
        if (map.get(color) == null) {
            synchronized (map) {
                if (map.get(color) == null) {
                    map.put(color, new Circle(color));
                    SUM_OBJECT++;
                }
            }
        }
        SUM++;
        return map.get(color);
    }
}

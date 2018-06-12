package com.roya.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.roya.demo.reflect.Apple");
//        Constructor[] constructors = clazz.getConstructors();
//        for (int i = 0; i < constructors.length; i++) {
//            System.out.println("construtor name: " + constructors[i].getName());
//        }

        Constructor constructor = clazz.getConstructor();
        Object instance =  constructor.newInstance("red apple");
        System.out.println(instance);
    }
}

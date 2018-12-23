package com.roya.demo.designPattern.creational.singleten;

public class SingletonHungary {

    private SingletonHungary(){};

    private static SingletonHungary instance = new SingletonHungary();

    public SingletonHungary getInstance() {
        return instance;
    }

}

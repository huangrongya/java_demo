package com.roya.demo.designPattern.creational.singleten;

public class Singleton {

    private Singleton(){};

    private Singleton instance;

    public Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

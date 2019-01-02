package com.roya.demo.designPattern.behavioral.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String massage) {
        System.out.println(massage+" "+name);
    }
}

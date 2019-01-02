package com.roya.demo.designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String massage) {
        for (Observer observer : list) {
            observer.update(massage);
        }
    }
}

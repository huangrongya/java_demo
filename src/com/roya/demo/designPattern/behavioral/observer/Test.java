package com.roya.demo.designPattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Observer observer = new ConcreteObserver("goudan");
        Observer observer2 = new ConcreteObserver("luffy");
        Observer observer3 = new ConcreteObserver("java");

        Subject subject = new ConcreteSubject();
        subject.attach(observer);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.notify("a message for");
    }
}

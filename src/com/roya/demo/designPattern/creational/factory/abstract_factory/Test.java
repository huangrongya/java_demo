package com.roya.demo.designPattern.creational.factory.abstract_factory;

public class Test {

    public static void main(String[] args) {
        Factory AKFactory = new BeefFactroy();
        Animal bullet = AKFactory.catchingAnimal();
        Food food = AKFactory.getFood();
        bullet.catching();
        food.cook();
    }
}

package com.roya.demo.designPattern.creational.factory.abstract_factory;

public class BeefFactroy implements Factory {
    @Override
    public Food getFood() {
        return new Beef();
    }

    @Override
    public Animal catchingAnimal() {
        return new Cattle();
    }
}

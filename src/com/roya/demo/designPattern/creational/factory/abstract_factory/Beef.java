package com.roya.demo.designPattern.creational.factory.abstract_factory;

public class Beef implements Food {
    @Override
    public void cook() {
        System.out.println("cooking beef...");
    }
}

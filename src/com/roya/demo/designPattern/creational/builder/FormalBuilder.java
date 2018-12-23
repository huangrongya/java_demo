package com.roya.demo.designPattern.creational.builder;

public class FormalBuilder extends Builder {
    @Override
    public void chooseCloth() {
        wearing.setCloth("suit");
    }

    @Override
    public void choosePants() {
        wearing.setPants("trousers");
    }

    @Override
    public void chooseShoes() {
        wearing.setShoes("leather shoes");
    }
}

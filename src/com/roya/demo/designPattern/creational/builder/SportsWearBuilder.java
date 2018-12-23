package com.roya.demo.designPattern.creational.builder;

public class SportsWearBuilder extends Builder {
    @Override
    public void chooseCloth() {
        wearing.setCloth("sports clothes");
    }

    @Override
    public void choosePants() {
        wearing.setPants("Sweatpants");
    }

    @Override
    public void chooseShoes() {
        wearing.setShoes("sports shoes");
    }
}

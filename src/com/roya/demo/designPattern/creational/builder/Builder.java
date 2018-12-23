package com.roya.demo.designPattern.creational.builder;

public abstract class Builder {
    Wearing wearing = new Wearing();
    public abstract void chooseCloth();
    public abstract void choosePants();
    public abstract void chooseShoes();
    public Wearing wear(){
        return wearing;
    }
}

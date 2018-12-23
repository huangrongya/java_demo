package com.roya.demo.designPattern.creational.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Wearing wear(){
        builder.chooseCloth();
        builder.choosePants();
        builder.chooseShoes();
        return builder.wear();
    }
}

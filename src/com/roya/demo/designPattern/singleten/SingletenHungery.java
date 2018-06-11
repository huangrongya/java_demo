package com.roya.demo.designPattern.singleten;

public class SingletenHungery {

    private static SingletenHungery instance = new SingletenHungery();

    private SingletenHungery(){}

    public static SingletenHungery getInstance(){
        return instance;
    }
}

package com.roya.demo.designPattern.singleten;

public class Singleten {

    private static Singleten instance;          //懒汉

    private Singleten(){}

    private static Singleten getInstance(){
        if (instance == null) {
            instance = new Singleten();
        }
        return instance;
    }
}

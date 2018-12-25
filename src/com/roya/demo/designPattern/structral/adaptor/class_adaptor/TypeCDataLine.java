package com.roya.demo.designPattern.structral.adaptor.class_adaptor;

public class TypeCDataLine implements DataLine{

    @Override
    public void connect() {
        System.out.println("connect with Type-C data line...");
    }
}

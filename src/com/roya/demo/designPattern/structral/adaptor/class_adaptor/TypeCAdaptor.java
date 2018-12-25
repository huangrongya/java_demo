package com.roya.demo.designPattern.structral.adaptor.class_adaptor;

public class TypeCAdaptor extends MicroDataLine implements DataLine {
    @Override
    public void connect() {
        System.out.println("use Type-C adaptor");
        super.connect();
    }
}

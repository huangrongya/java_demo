package com.roya.demo.designPattern.structral.adaptor.class_adaptor;

public class Test {
    public static void main(String[] args) {
        DataLine dataLine = new TypeCDataLine();
        dataLine.connect();
        DataLine adaptor = new TypeCAdaptor();
        adaptor.connect();
    }
}

package com.roya.demo.designPattern.structral.adaptor.object_adaptor;

import com.roya.demo.designPattern.structral.adaptor.class_adaptor.TypeCDataLine;

public class Test {
    public static void main(String[] args) {
        TypeCAdaptor adaptor = new TypeCAdaptor(new TypeCDataLine());
        adaptor.connect();
    }
}

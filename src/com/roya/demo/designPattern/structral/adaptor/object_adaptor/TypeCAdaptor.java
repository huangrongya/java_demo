package com.roya.demo.designPattern.structral.adaptor.object_adaptor;

import com.roya.demo.designPattern.structral.adaptor.class_adaptor.DataLine;
import com.roya.demo.designPattern.structral.adaptor.class_adaptor.TypeCDataLine;

public class TypeCAdaptor implements DataLine {
    DataLine dataLine = new TypeCDataLine();

    public TypeCAdaptor(DataLine dataLine) {
        this.dataLine = dataLine;
    }

    @Override
    public void connect() {
        System.out.println("use Type-C adaptor...");
        dataLine.connect();
    }
}

package com.roya.demo.designPattern.structral.proxy;

public class Source implements ISource {
    @Override
    public void method() {
        System.out.println("the original method!!!");
    }
}

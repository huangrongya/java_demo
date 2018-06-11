package com.roya.demo.designPattern.proxy;

public class Test {
    public static void main(String[] args) {
        ISource source = new Proxy();
        source.method();
    }
}

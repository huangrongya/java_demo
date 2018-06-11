package com.roya.demo.designPattern.proxy;

public class Proxy implements ISource {

    private Source source;

    public Proxy(){
        this.source = new Source();
    }

    @Override
    public void method() {
        if (source == null) {
            source = new Source();
        }
        source.method();
    }
}

package com.roya.demo.proxy;

public class HelloServiceImpl implements IHelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("hello, "+name);
    }
}

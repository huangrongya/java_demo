package com.roya.demo.proxy;

public class Test {

    public static void main(String[] args) {
        IHelloService helloService = new HelloServiceImpl();
        ProxyTest proxyTest = new ProxyTest();
        helloService = (IHelloService) proxyTest.bind(helloService, new Class[]{IHelloService.class});
        helloService.sayHello("li goudan");
    }
}

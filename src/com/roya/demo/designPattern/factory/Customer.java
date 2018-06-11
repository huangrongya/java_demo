package com.roya.demo.designPattern.factory;

public class Customer {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}

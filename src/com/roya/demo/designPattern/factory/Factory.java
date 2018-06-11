package com.roya.demo.designPattern.factory;

public class Factory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product();
    }
}

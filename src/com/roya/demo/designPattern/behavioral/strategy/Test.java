package com.roya.demo.designPattern.behavioral.strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context("A");
        context.chooseStrategy();
    }
}

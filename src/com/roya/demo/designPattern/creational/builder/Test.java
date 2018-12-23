package com.roya.demo.designPattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        FormalBuilder builder = new FormalBuilder();
        Director director = new Director(builder);
        Wearing wearing = director.wear();
        System.out.println("cloth："+wearing.getCloth());
        System.out.println("pants："+wearing.getPants());
        System.out.println("shoes："+wearing.getShoes());
    }
}

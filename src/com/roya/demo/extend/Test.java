package com.roya.demo.extend;

public class Test {

    public static void main(String[] args) {
        //字类继承了私有属性 但是不能访问
        Son son = new Son();
        System.out.println(son);
    }
}

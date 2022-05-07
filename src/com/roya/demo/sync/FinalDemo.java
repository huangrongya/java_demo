package com.roya.demo.sync;

/**
 * final
 * @author royle
 */
public class FinalDemo {

    private int a;

    private final int b;

    private static FinalDemo finalDemo;

    public FinalDemo() {
        this.a = 1;
        this.b = 2;
    }

    public static void writer(){
        finalDemo = new FinalDemo();
    }

    public static void read(){
        FinalDemo demo = finalDemo;
        int a = demo.a;//普通域
        int b = demo.b;//final域
        System.out.println(a+"=============="+b);
    }

    public static void main(String[] args) {
//        new Thread(() -> FinalDemo.writer()).start();
//        new Thread(() -> FinalDemo.read()).start();

        final byte b1 = 1;
        final byte b2 = 1;
        byte b3 = b1+b2;
    }
}

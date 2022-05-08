package com.roya.demo.sync;

/**
 * @author royle
 */
public class VolatileTest {

    int a = 1;

    int b = 2;

    public void change(){
        a = 3;
        b = a;
    }

    public void print(){
        System.out.println("a="+a+" b="+b);
    }

    public static void main(String[] args) {

        //第一个线程执行a=3 对另一个线程不可见 可能会打印a=1 b=3的结果
        while (true){
            VolatileTest test = new VolatileTest();
            new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.change();
            }).start();
            new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.print();
            }).start();
        }
    }
}

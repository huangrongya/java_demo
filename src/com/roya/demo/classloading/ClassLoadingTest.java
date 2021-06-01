package com.roya.demo.classloading;

/**
 * @author royle
 */
public class ClassLoadingTest {

    public static void main(String[] args) {
        //被动引用1：通过子类引用父类的静态字段
        System.out.println(SupperClass.FINAL_STATIC_VALUE);
        System.out.println(SupperClass.staticValue);
//
//        //被动引用2：通过数组定义引用类
        SupperClass[] sca = new SupperClass[10];
//
//        //被动引用3：常量加入常量池，本质没有直接引用到定义常量的类；第二条没有被final修饰，没有放入常量池，会初始化
        System.out.println(ConstantClass.FINAL_STATIC_VALUE);
        System.out.println(ConstantClass.staticValue);
    }
}

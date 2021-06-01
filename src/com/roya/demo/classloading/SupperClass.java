package com.roya.demo.classloading;

/**
 * 父类
 * @author royle
 */
public class SupperClass {

    static {
        System.out.println("supper class init~~~");
    }

    public static String staticValue = "static Value";
    public static final String FINAL_STATIC_VALUE = "final Static Value";
}

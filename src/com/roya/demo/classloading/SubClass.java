package com.roya.demo.classloading;

/**
 * @author royle
 */
public class SubClass extends SupperClass {

    static {
        System.out.println("========sub class init=========");
    }
}

package com.roya.demo;

import javax.xml.bind.JAXBException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo1 {

    public static void main(String[] args) {

//        String a = new String("ab");
//        String b = new String("ab");
//        String aa = "ab";
//        String bb = "ab";
//
//        System.out.println(aa == bb);
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

//        for (int i = 0; i < 20; i++) {
//            int j = (int) (Math.random()*25);
//            System.out.println(j);
//        }

//        int score=80;
//
//        System.out.println(sumHeight());
//





    }

    private static float sumHeight(){
        int height = 100;
        for (int i = 0; i < 10; i++) {
            height+=height/2;
        }
        return height;
    }
}

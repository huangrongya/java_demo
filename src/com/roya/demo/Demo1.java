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
//        String s = "4JDVEKOTLI430678VI_2020-08-10-19-22-01_2020-08-10-19-32-10";
//        String s1 = "1400357924_1813_product_2020-08-10-15-30-31_2020-08-10-16-00-44";
//        System.out.println(s.substring(0,18));
//        System.out.println(s1.substring(0,s1.indexOf("product")+7));
//
//        BigDecimal a = new BigDecimal(-3819);
//        BigDecimal b = new BigDecimal(99);
//        BigDecimal c = a.divide(b, 2, RoundingMode.HALF_UP);
//        System.out.println("-------------"+c);





    }

    private static float sumHeight(){
        int height = 100;
        for (int i = 0; i < 10; i++) {
            height+=height/2;
        }
        return height;
    }
}

package com.roya.demo.Generics;

public class Test {

    public static void main(String[] args) {
        Generic<String> generic = new Generic<>("hello");
        Generic<Integer> generic2 = new Generic<>(123);

        System.out.println(generic.getKey()+ "...." + generic2.getKey());
    }



}

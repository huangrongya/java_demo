package com.roya.demo.designPattern.behavioral.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("football game initialized, start playing");
    }

    @Override
    void startPlay() {
        System.out.println("football game started, enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("football game finished!");
    }
}

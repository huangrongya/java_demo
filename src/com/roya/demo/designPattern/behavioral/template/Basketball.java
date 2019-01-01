package com.roya.demo.designPattern.behavioral.template;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("basketball game initialized, start playing");
    }

    @Override
    void startPlay() {
        System.out.println("basketball game started, enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("basketball game finished!");
    }
}

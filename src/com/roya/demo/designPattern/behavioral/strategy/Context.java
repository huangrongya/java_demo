package com.roya.demo.designPattern.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Context(String str) {
        switch (str){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
        }
    }

    public void chooseStrategy(){
        strategy.show();
    }
}

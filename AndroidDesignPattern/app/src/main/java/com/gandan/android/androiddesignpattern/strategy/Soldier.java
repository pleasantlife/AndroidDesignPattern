package com.gandan.android.androiddesignpattern.strategy;

public class Soldier {

    public void runContext(Strategy strategy){
        strategy.runStrategy();
    }
}

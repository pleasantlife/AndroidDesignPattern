package com.gandan.android.androiddesignpattern.templatecallback;

import android.util.Log;

public class SoldierWithRefactoring {
    public void runContext(String strategySound){
        Log.e("War", "Start!!");
        execute(strategySound).runStrategy();
    }

    private Strategy execute(final String strategySound){
        return new Strategy() {
            @Override
            public void runStrategy() {
                Log.e("War", strategySound+"");
            }
        };
    }
}

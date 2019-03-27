package com.gandan.android.androiddesignpattern.strategy;

import android.util.Log;

public class StrategyGrenade implements Strategy {

    @Override
    public void runStrategy() {
        Log.e("Grenade", "Throw Grenade");
    }
}

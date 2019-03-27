package com.gandan.android.androiddesignpattern.strategy;

import android.util.Log;

public class StrategyGun implements Strategy {
    @Override
    public void runStrategy() {
        Log.e("Gun", "Shoot a Gun!");
    }
}

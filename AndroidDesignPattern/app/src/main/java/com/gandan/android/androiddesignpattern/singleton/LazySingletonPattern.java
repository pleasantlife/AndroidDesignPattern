package com.gandan.android.androiddesignpattern.singleton;

public class LazySingletonPattern {
    private static LazySingletonPattern instance;

    private LazySingletonPattern() {}

    public static LazySingletonPattern getInstance() {
        if(instance == null){
            instance = new LazySingletonPattern();
        }
        return instance;
    }
}

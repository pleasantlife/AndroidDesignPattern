package com.gandan.android.androiddesignpattern.singleton;

import android.content.Context;

public class CustomSingletonPattern {

    private static CustomSingletonPattern instance;

    public static void init(Context context){
        if(instance == null){
            context = context.getApplicationContext();
            instance = new CustomSingletonPattern(context);
        }
    }

    public static CustomSingletonPattern getInstance() {
        return instance;
    }

    private final Context context;

    private CustomSingletonPattern(Context context){
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

}

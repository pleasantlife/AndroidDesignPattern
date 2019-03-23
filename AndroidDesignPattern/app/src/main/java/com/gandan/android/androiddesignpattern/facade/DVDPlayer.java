package com.gandan.android.androiddesignpattern.facade;

import android.util.Log;

public class DVDPlayer {

    private String movie;

    public void play(String movie){
        this.movie = movie;
        Log.e("playing...", movie+"");
    }
}

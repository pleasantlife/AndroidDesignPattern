package com.gandan.android.androiddesignpattern.facade;

import android.util.Log;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvdPlayer;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DVDPlayer dvdPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        Log.e("Get Ready :", "to watch a movie...");
        popper.on();
        popper.pop();
        dvdPlayer.play(movie);
        amp.on();
        amp.setDVD(dvdPlayer);
        screen.down();
        lights.setLightDim(10);
        projector.setWideScreen();
    }
}

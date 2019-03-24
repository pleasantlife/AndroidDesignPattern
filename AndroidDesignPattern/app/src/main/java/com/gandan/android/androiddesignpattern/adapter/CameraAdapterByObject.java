package com.gandan.android.androiddesignpattern.adapter;

public class CameraAdapterByObject implements Connectable {

    Camera camera = new Camera();

    @Override
    public void connectCameraA() {
        camera.connectCameraA();
    }

    @Override
    public void connectCameraB() {
        camera.connectCameraB();
    }
}

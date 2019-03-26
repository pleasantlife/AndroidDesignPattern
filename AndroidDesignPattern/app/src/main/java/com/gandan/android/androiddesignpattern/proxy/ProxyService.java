package com.gandan.android.androiddesignpattern.proxy;

public class ProxyService implements IService {
    @Override
    public String runSomething() {
        return "Running Service...";
    }
}

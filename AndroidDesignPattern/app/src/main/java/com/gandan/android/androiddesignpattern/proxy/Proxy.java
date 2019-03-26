package com.gandan.android.androiddesignpattern.proxy;

public class Proxy implements IService {

    IService service1;

    @Override
    public String runSomething() {
        service1 = new ProxyService();
        return service1.runSomething();
    }
}

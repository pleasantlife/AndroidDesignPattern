package com.gandan.android.androiddesignpattern.singleton;

/**
 *  Holder에 의한 초기화 방식
 *  : Lazy initialization의 장점 + Thread간 동기화 문제 해결
 *  => 가장 많이 사용하고 있는 방식.
 */

public class HolderSingletonPattern {

    private HolderSingletonPattern() {}

    private static class SingletonHolder {
        public static final HolderSingletonPattern INSTANCE = new HolderSingletonPattern();
    }
    public static HolderSingletonPattern getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

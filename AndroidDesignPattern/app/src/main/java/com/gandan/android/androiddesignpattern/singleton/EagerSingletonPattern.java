package com.gandan.android.androiddesignpattern.singleton;

/**
 *  싱글턴 패턴
 *
 *  어떤 클래스의 인스턴스는 오직 하나임을 보장하며,
 *  이 인스턴스에 접근할 수 있는 전역적인 접촉점을 제공하는 패턴
 *  => 메모리를 효율적으로 사용할 수 있음.
 *  => 다른 클래스의 인스턴스들이 데이터를 공유/변경 가능
 *
 */

public class EagerSingletonPattern {

    private static final EagerSingletonPattern instance = new EagerSingletonPattern();

    private EagerSingletonPattern () {}

    public static EagerSingletonPattern getInstance() {
        return instance;
    }

}

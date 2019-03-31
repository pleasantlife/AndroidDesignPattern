package com.gandan.android.androiddesignpattern.builder;

/**
 *  빌더 패턴을 사용하여 하나의 빌더 객체로 여러 객체를 만들기
 *  - 인터페이스를 만들고 원하는 빌더 클래스에서 해당 인터페이스를 implement하면 된다.
 */

public interface BuilderInterface<T> {
    public T build();
}

package com.songfuxing.patterns.complex.combination;

/**
 * 定义观察者，以及回调函数
 */
public interface Observer {
    public void update(QuackObservable observable);
}

package com.songfuxing.patterns.complex.combination;

/**
 * 观察者的实现类
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable observable) {
        System.out.println("quackologist recieve data:" + observable);
    }
}

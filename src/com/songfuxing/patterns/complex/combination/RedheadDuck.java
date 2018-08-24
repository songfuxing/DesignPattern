package com.songfuxing.patterns.complex.combination;

import java.util.Observer;

/**
 * 一种鸭
 */
public class RedheadDuck implements Quackable {
    public void quack() {
        System.out.println("read head duck: quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

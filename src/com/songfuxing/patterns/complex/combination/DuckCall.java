package com.songfuxing.patterns.complex.combination;

import java.util.Observer;

/**
 * 一种鸭叫器
 */
public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("duck call: Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

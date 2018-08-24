package com.songfuxing.patterns.complex.combination;

import java.util.Observer;

/**
 * 一种鸭
 */
public class MallardDuck implements Quackable {
    public void quack() {
        System.out.println("MallardDuck: quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

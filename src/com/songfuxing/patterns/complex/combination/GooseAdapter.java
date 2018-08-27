package com.songfuxing.patterns.complex.combination;


/**
 * 适配器模式
 * 为了让鹅与鸭子对接口一致，改变鹅的接口
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

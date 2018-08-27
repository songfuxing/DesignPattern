package com.songfuxing.patterns.complex.combination;


/**
 * 一种鸭
 */
public class MallardDuck implements Quackable {
    ObservableProxy observable;
    public MallardDuck() {
        this.observable = new ObservableProxy(this);
    }

    public void quack() {
        System.out.println("MallardDuck: quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

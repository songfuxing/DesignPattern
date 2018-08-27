package com.songfuxing.patterns.complex.combination;


/**
 * 一种鸭
 */
public class RedheadDuck implements Quackable {
    ObservableProxy observableProxy;
    public RedheadDuck() {
        this.observableProxy = new ObservableProxy(this);
    }
    public void quack() {
        System.out.println("read head duck: quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observableProxy.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observableProxy.notifyObservers();
    }
}

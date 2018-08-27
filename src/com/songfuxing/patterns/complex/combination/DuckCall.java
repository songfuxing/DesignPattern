package com.songfuxing.patterns.complex.combination;


/**
 * 一种鸭叫器
 */
public class DuckCall implements Quackable {
    // 被观察者辅助类，用于统一处理observable的资源
    ObservableProxy observableProxy;

    public DuckCall() {
        this.observableProxy = new ObservableProxy(this);
    }

    public void quack() {
        System.out.println("duck call: Kwak");
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

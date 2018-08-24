package com.songfuxing.patterns.complex.combination;

import java.util.ArrayList;

/**
 * 被观察者辅助类，可以让被观察者的实现在这一份代码中
 */
public class ObservableProxy implements QuackObservable{
    ArrayList<Observer> observers = new ArrayList();
    QuackObservable data;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(data);
        }

    }
}

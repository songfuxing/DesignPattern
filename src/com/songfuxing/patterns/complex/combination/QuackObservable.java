package com.songfuxing.patterns.complex.combination;


/**
 * Created by songfuxing on 2018/8/24.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}

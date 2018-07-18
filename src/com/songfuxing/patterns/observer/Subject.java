package com.songfuxing.patterns.observer;

/**
 * Created by songfuxing on 2018/6/22.
 */
public interface Subject {
    public void registerObservers(Observer observer);
    public void removeObservers(Observer observer);
    public void noticObservers();
}

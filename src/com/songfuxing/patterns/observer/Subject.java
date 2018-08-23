package com.songfuxing.patterns.observer;

/**
 * 主题接口，对象使用此接口注册为观察者（订阅），或者从观察者队列中删除自己（退订）
 */
public interface Subject {
    public void registerObservers(Observer observer);
    public void removeObservers(Observer observer);
    public void noticObservers();
}

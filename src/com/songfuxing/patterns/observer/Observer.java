package com.songfuxing.patterns.observer;

/**
 * 观察者接口，只有一个update方法，当主题改变当时候，他被调用
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}

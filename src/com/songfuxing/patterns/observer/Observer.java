package com.songfuxing.patterns.observer;

/**
 * Created by songfuxing on 2018/6/22.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}

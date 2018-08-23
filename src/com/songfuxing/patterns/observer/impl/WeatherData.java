package com.songfuxing.patterns.observer.impl;

import java.util.Observable;


/**
 * 使用java的Observable接口，和主题功能类似。具有观察者注册/退订消息，通知观察者等功能。
 * weatherdata是我们的subject, 称为observable.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {

    }

    public void messurementsChanged() {
        // observable中只有当changed为true时才会通知用户。这样可以控制推送消息的粒度
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementsChanged();
    }
}

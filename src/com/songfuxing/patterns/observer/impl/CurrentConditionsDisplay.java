package com.songfuxing.patterns.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.songfuxing.patterns.observer.Display;

/**
 * 观察者，可以主动的订阅/退订消息。
 * 必须实现update方法，让主题调用
 */
public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable , Object obj) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("CurrentConditions display, temperature: " + this.temperature + ", humidity: " + this.humidity
        + ", pressure: " + this.pressure);
    }

    public void exit() {
        observable.deleteObserver(this);
    }

}


package com.songfuxing.patterns.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.songfuxing.patterns.observer.Display;

/**
 * Created by songfuxing on 2018/6/22.
 */
public class StatisticsDisplay implements Display, Observer {
    private float temperature;
    private float humiduty;
    private float pressure;

    private Observable weatherData;

    public StatisticsDisplay(Observable subject) {
        this.weatherData = subject;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object obj) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display(){
        System.out.println("static display: temperature:" + temperature);
    }
}

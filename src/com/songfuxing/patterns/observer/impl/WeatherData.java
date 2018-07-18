package com.songfuxing.patterns.observer.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import com.songfuxing.patterns.observer.Observer;
import com.songfuxing.patterns.observer.Subject;

/**
 * Created by songfuxing on 2018/6/22.
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

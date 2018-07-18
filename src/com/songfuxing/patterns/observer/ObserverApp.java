package com.songfuxing.patterns.observer;
import java.util.Observer;

import com.songfuxing.patterns.observer.impl.CurrentConditionsDisplay;
import com.songfuxing.patterns.observer.impl.StatisticsDisplay;
import com.songfuxing.patterns.observer.impl.WeatherData;

/**
 * Created by songfuxing on 2018/6/22.
 */
public class ObserverApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(3,4,5);
        currentConditionsDisplay.exit();
        weatherData.setMeasurements(30,4,5);
    }
}

package com.datahonor.learn.pattern.observer.weatherobservable;

import com.datahonor.learn.pattern.observer.weather.CurrentConditionDisplay;
import com.datahonor.learn.pattern.observer.weather.ForecastDisplay;
import com.datahonor.learn.pattern.observer.weather.HeatIndexDisplay;
import com.datahonor.learn.pattern.observer.weather.StatisticDisplay;
import com.datahonor.learn.pattern.observer.weather.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        com.datahonor.learn.pattern.observer.weather.WeatherData weatherData = new WeatherData();

        com.datahonor.learn.pattern.observer.weather.CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        com.datahonor.learn.pattern.observer.weather.StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        com.datahonor.learn.pattern.observer.weather.ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        com.datahonor.learn.pattern.observer.weather.HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(79, 90, 29.2f);
    }
}

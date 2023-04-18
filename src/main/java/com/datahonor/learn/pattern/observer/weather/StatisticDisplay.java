package com.datahonor.learn.pattern.observer.weather;

public class StatisticDisplay implements Observer, DisplayElement{
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float sumTemperature = 0.0f;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemperature += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemperature / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}

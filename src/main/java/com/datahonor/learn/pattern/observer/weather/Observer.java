package com.datahonor.learn.pattern.observer.weather;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}

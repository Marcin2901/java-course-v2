package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithStub() {
        Temperatures temperatures = new TemperatureStub();
        WeatherForecast forecast = new WeatherForecast(temperatures);

        int quantityOfSensors = forecast.calculateForecast().size();

        Assertions.assertEquals(5, quantityOfSensors);
    }
}

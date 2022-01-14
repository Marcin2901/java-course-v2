package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperatureStub implements Temperatures {


    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();

        stubResult.put(0, 11.1);
        stubResult.put(1, 12.1);
        stubResult.put(2, 13.1);
        stubResult.put(3, 14.1);
        stubResult.put(4, 15.1);

        return stubResult;
    }
}

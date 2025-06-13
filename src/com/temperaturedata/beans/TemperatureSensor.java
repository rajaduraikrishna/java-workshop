package com.temperaturedata.beans;

public class TemperatureSensor implements  Sensor {
    private float temperatureValue;
    public TemperatureSensor(float aTemperatureValue) {
        temperatureValue = aTemperatureValue;
    }
    public float getReading() {
        return this.temperatureValue;
    }
    public float getReading(String unit) {
        if ("C".equalsIgnoreCase(unit)) {
            return temperatureValue;
        }
        if ("F".equalsIgnoreCase(unit)) {
            return (temperatureValue * 9/5) + 32;
        }
        return 0.0f;
    }

    public static void main(String[] args) {
        Sensor temperatureSensor = new TemperatureSensor(32);
        System.out.println(temperatureSensor.getReading());
        System.out.println(temperatureSensor.getReading("F"));
        System.out.println(temperatureSensor.getReading("C"));
    }
}

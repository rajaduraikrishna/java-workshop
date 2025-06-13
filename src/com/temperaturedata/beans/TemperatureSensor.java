package com.temperaturedata.beans;

public class TemperatureSensor implements  Sensor {
    private float temperatureValue;
    public TemperatureSensor(float aTemperatureValue) {
        temperatureValue = aTemperatureValue;
    }
    public float getReading() {
        return this.temperatureValue;
    }
    public float getReading(ReadingUnit unit) {
        if (ReadingUnit.C.equals(unit)) {
            return temperatureValue;
        }
        if (ReadingUnit.F.equals(unit)) {
            return (temperatureValue * 9/5) + 32;
        }
        return 0.0f;
    }
//    @Override
//    public String toString(){
//        return "Temperature :" + temperatureValue;
//    }
    @Override
    public int hashCode() {
        return (int)temperatureValue*34;
    }
    @Override
    public boolean equals(Object temperatureSensor) {
        TemperatureSensor myObj = (TemperatureSensor) temperatureSensor;
        if (super.equals(myObj)) {
            return true;
        } else {
            return this.temperatureValue == myObj.temperatureValue;
        }
    }
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(32);
        System.out.println(temperatureSensor.getReading());
        System.out.println(temperatureSensor.getReading(ReadingUnit.F));
        System.out.println(temperatureSensor.getReading(ReadingUnit.C));

        System.out.println(temperatureSensor.getClass());
        System.out.println(temperatureSensor.hashCode());
        System.out.println(temperatureSensor.toString());
        TemperatureSensor myAnotherTemperatureSensor = new TemperatureSensor(32);
        System.out.println(temperatureSensor == myAnotherTemperatureSensor);
        System.out.println(myAnotherTemperatureSensor.hashCode());
        System.out.println(myAnotherTemperatureSensor.toString());
        System.out.println(myAnotherTemperatureSensor.equals(temperatureSensor));

    }
}

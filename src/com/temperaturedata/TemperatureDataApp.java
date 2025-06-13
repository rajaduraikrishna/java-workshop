package com.temperaturedata;

import com.temperaturedata.beans.Building;
import com.temperaturedata.beans.TemperatureSensor;

public class TemperatureDataApp {

    public static void doSomething() {
        System.out.println("Tell me what to do");
    }
    public static void main(String[] args) {
        Building building = new Building();
        Building.Parking parking = new Building.Parking();
        parking.print();
        TemperatureDataApp.doSomething();

    }
}

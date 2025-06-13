package com.temperaturedata.beans;

import org.w3c.dom.ls.LSOutput;

public class Building {
    private String buildingName;
    private float height;
    private float squareFeet;
    public Building(String aBuildingName, float aHeight, float aSquareFeet) {
        buildingName = aBuildingName;
        height = aHeight;
        squareFeet = aSquareFeet;
    }
    public static class Parking {

        public void print() {
            System.out.println("Parking of some building");
        }
    }
}

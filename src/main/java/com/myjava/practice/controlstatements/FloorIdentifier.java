package com.myjava.practice.controlstatements;

public class FloorIdentifier {
    public void identifyFloorType(int floorNumber) {
        if (floorNumber%2 == 0) {
            System.out.println("Even Floor");
        } else {
            System.out.println("Odd Floor");
        }
    }

    public static void main(String[] args) {
        FloorIdentifier floorIdentifier = new FloorIdentifier();
        floorIdentifier.identifyFloorType(6);
    }
}

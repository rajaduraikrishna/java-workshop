package com.myjava.practice.controlstatements;

public class FloorPrinterWhile {
    public void print(int numberOfFloors) {
        int i = 0;
        do {
            System.out.println("Floor " + i);
            i++;
        } while (i <numberOfFloors) ;
    }

    public static void main(String[] args) {
        FloorPrinterWhile floorPrinterWhile = new FloorPrinterWhile();
        floorPrinterWhile.print(0);
    }
}

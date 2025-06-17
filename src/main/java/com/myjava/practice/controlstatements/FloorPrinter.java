package com.myjava.practice.controlstatements;

import java.sql.SQLOutput;

public class FloorPrinter {
    public void print(int builingNumber, int noOfFloors) {
        System.out.println("Building " + builingNumber);
        for (int i = 0; i<noOfFloors; i++) {
            System.out.println("Floor " + i);
        }
    }

    public static void main(String[] args) {
        FloorPrinter printer = new FloorPrinter();
        printer.print(1,23);
        printer.print(2,15);
        printer.print(3,20);

    }
}

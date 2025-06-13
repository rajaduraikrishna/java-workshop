package com.myjava.practice.arrays;

public class BuildingFloor {

    public static void main(String[] args) {
        String[][] buildFloor = { {"A", "B", "C", "D","E"}, {"12","15","23","7","19"}};
        //String[][] buildFloor = new String[2][5];
        int x = buildFloor[0].length;
        for(int i=0;i<x;i++) {
            for(int j=0;j<buildFloor.length;j++) {
                System.out.println(buildFloor[j][i]);
            }
        }
    }
}

package com.myjava.practice.arrays;

import java.util.Arrays;

public class BuildingArray {
    public static void main(String[] args) {
        //char[] buildings = {'A', 'B', 'C', 'D','E'};
        char buildings[] = new char[5];
        buildings[0] = 'A';
        buildings[1] = 'B';
        buildings[2] = 'C';
        buildings[3] = 'D';
        buildings[4] = 'E';
//        System.out.println(buildings);
        char []buildingCopy = new char[5];
//        Manual array copy
//        for (int x=0;x<buildings.length;x++) {
//            buildingCopy[x] = buildings[x];
//        }
        /** Using System.ArrayCopy */
        //System.arraycopy(buildings, 0, buildingCopy,0,buildings.length);
        /** Arrays.copy */
        buildingCopy = Arrays.copyOf(buildings,buildings.length);


        System.out.println("Old building");
        for(int i = 0; i <buildings.length; i++) {
            System.out.println(buildings[i]);
        }
        System.out.println("New Building");
        for(int i = 0; i <buildingCopy.length; i++) {
            System.out.println(buildingCopy[i]);
        }
    }
}

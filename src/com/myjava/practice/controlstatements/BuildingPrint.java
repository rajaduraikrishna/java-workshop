package com.myjava.practice.controlstatements;

public class BuildingPrint {

    public void print(char buildingIdentifier) {
        switch (buildingIdentifier) {
            case 'A':
            case 'F':
            case 'N':
                System.out.println("10 Floors");
                break;
            case 'B':
                System.out.println("14 Floors");
                break;

            default:
                System.out.println("11 Floors");

        }
    }

    public static void main(String[] args) {
        BuildingPrint buildingPrint = new BuildingPrint();
        buildingPrint.print('A');
        buildingPrint.print('F');
        buildingPrint.print('N');
        buildingPrint.print('B');
        buildingPrint.print('M');

    }
}

package com.myjava.practice.controlstatements;

import java.util.Scanner;

public class TempCheck {

    public void checkTemperature(float temperature) {
        if (temperature < 18 || temperature > 28) {
            System.out.println(temperature + " is greater than 28");
        }
    }

    public static void main(String[] args) {
        TempCheck tempCheck = new TempCheck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 temperature value for sensor 1 :");
        float t1 = scanner.nextFloat();
        float t2 = scanner.nextFloat();
        float t3 = scanner.nextFloat();
        float t4 = scanner.nextFloat();
        float t5 = scanner.nextFloat();
        tempCheck.checkTemperature(t1);
        tempCheck.checkTemperature(t2);
        tempCheck.checkTemperature(t3);
        tempCheck.checkTemperature(t4);
        tempCheck.checkTemperature(t5);

    }
}

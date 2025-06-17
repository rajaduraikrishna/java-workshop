package com.myjava.practice.controlstatements;

import java.util.Scanner;

public class CoolLevelCheck {
    public void checkLevel(float temperature) {
        if (temperature >= 18 && temperature <= 28) {
            if (temperature <= 20) {
                System.out.println("Coolest");
            } else if (temperature <= 24) {
                System.out.println("Cooler");
            } else {
                System.out.println("Cool");
            }
        } else  {
            System.out.println(temperature + " is out of range");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temp = scanner.nextFloat();
        CoolLevelCheck coolLevelCheck = new CoolLevelCheck();
        coolLevelCheck.checkLevel(temp);
    }
}

package com.temperaturedata;

import com.myjava.practice.exception.TemperatureRangeException;
import com.temperaturedata.beans.Building;
import com.temperaturedata.beans.Organaization;
import com.temperaturedata.beans.Sensor;
import com.temperaturedata.beans.TemperatureSensor;

import java.io.*;
import java.time.LocalDate;
import java.util.Objects;

public class TemperatureDataApp {

    public static void doSomething() {
        System.out.println("Tell me what to do");
    }
    public static void main(String[] args) {
        try {
            TemperatureSensor temperatureSensor = new TemperatureSensor(45);
            temperatureSensor = new TemperatureSensor(98);
        } catch (TemperatureRangeException e) {
            throw new RuntimeException(e);
        }

    }

    private static void extracted() throws ClassNotFoundException {
        Organaization ourkadaiTechnologies = new Organaization();
        ourkadaiTechnologies.setName("Ourkadai Technologies");
        ourkadaiTechnologies.setDateOfInitiation(LocalDate.of(2021,04,14));
        ourkadaiTechnologies.setEmail("operations@ourkadai.com");
        ourkadaiTechnologies.setCeo("Haripirya Ravichandran");
        ourkadaiTechnologies.setContactNumber("+919886325224");
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            outputStream = new FileOutputStream("OurkdataiTechnologiex.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(ourkadaiTechnologies);

            fileInputStream = new FileInputStream("OurkdataiTechnologiex.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Organaization myOrg = (Organaization) objectInputStream.readObject();
            System.out.println(myOrg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch(IOException exception) {
                System.out.println("Error closing the resources");
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream("OurkdataiTechnologiex.txt")) {

            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(ourkadaiTechnologies);

            fileInputStream = new FileInputStream("OurkdataiTechnologiex.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Organaization myOrg = (Organaization) objectInputStream.readObject();
            System.out.println(myOrg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

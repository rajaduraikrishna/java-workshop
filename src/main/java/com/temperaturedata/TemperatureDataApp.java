package com.temperaturedata;

import com.temperaturedata.beans.Building;
import com.temperaturedata.beans.Organaization;
import com.temperaturedata.beans.TemperatureSensor;

import java.io.*;
import java.time.LocalDate;

public class TemperatureDataApp {

    public static void doSomething() {
        System.out.println("Tell me what to do");
    }
    public static void main(String[] args) {
//        Building building = new Building();
//        Building.Parking parking = new Building.Parking();
//        parking.print();
//        TemperatureDataApp.doSomething();

        Organaization ourkadaiTechnologies = new Organaization();
        ourkadaiTechnologies.setName("Ourkadai Technologies");
        ourkadaiTechnologies.setDateOfInitiation(LocalDate.of(2021,04,14));
        ourkadaiTechnologies.setEmail("operations@ourkadai.com");
        ourkadaiTechnologies.setCeo("Haripirya Ravichandran");
        ourkadaiTechnologies.setContactNumber("+919886325224");

        try {
            FileOutputStream outputStream = new FileOutputStream("OurkdataiTechnologiex.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(ourkadaiTechnologies);
            objectOutputStream.close();
            outputStream.close();
            FileInputStream fileInputStream = new FileInputStream("OurkdataiTechnologiex.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Organaization myOrg = (Organaization) objectInputStream.readObject();
            System.out.println(myOrg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

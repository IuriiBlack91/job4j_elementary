package ru.job4j.calculator;

import java.util.jar.JarEntry;

public class TemperatureFit {

    public static double idealTemperatureForFruits(int temperature) {
        // Ideal temperature for storing fruits in Celcius
        return temperature - 2.0;
    }

    public static double idealTemperatureForMeat(int temperature) {
        // Ideal temperature for storing meat in Celcius
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int temperature = 10;     // Example room temperature
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemp + "°C");
    }
}

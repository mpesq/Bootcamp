package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        SmartDevice dispositivo = new SmartDevice("Samsung", "GalaxyS22");
        SmartWatch reloj = new SmartWatch("Garmin", "Forerunner45", 50, true);
        SmartPhone telefono = new SmartPhone("Iphone", "14", true, 1.1, 2022);

        System.out.println(dispositivo);
        System.out.println(reloj);
        System.out.println(telefono);
    }
}

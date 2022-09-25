package com.company;

public class SmartWatch extends SmartDevice {

    //Atributos

    int waterResistantMeters;
    boolean gps;

    //constructor vacio

    public SmartWatch() {
        super();
    }

    //constructor con argumentos

    public SmartWatch(String marca, String modelo, int waterResistantMeters, boolean gps) {
        super(marca, modelo);
        this.waterResistantMeters = waterResistantMeters;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "marca = " + marca + ", modelo = " + modelo + ", resistencia al agua en mts = " + waterResistantMeters +
                ", gps = " + gps;
    }
}

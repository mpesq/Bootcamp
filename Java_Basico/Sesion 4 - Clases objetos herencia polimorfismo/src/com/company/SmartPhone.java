package com.company;

public class SmartPhone extends SmartDevice {

    //Atributos
    Boolean facialRecognition;
    double version;
    int year;

    //constructor vacio
    public SmartPhone() {
        super();
    }

    //constructor con argumentos

    public SmartPhone(String marca, String modelo, Boolean facialRecognition, double version, int year) {
        super(marca, modelo);
        this.facialRecognition = facialRecognition;
        this.version = version;
        this.year = year;
    }

    @Override
    public String toString() {
        return "marca = " + marca + ", modelo = " + modelo + ", reconocimiento facial = " +
        facialRecognition + ", version = " + version + ", anyo = " + year;
    }
}

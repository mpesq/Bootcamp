package com.company;

public class SmartDevice {

    //atributes

    String marca;
    String modelo;

    //Constructor vacío

    public SmartDevice() {
    }

    //Constructor con parámetros


    public SmartDevice(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "marca = " + marca + ", modelo = " + modelo;
    }
}

package org.example.OOP;

public class Camion extends Vehicle {
    public Camion(String marca) {
        super(marca);
    this.ruedas = 4;
    }

    @Override
    public void acelerar() {
    this.velocity += 60; // polimorfismo
    }

    @Override
    public String toString() {
        return "El camion va a: " + this.velocity + " Km/h";
    }

}

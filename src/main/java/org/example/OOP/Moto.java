package org.example.OOP;

public class Moto extends Vehicle {


    public Moto(String brand) {
        super(brand);
        this.ruedas = 2;

    }

    @Override
    public void acelerar() {
        this.velocity += 30;
    }

    @Override
    public String toString() {
        return "La moto va a: " + this.velocity + " km/h";
    }
}

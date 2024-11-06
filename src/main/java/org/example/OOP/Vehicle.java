package org.example.OOP;

public abstract class Vehicle {

    // 3 atributos
    private String brand;
    protected int velocity;
    protected int ruedas;


    // constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.velocity = velocity;
    }

    // metodos
    public void acelerar() {
        this.velocity += 10;

    }

    public void frenar() {
        this.velocity -= 10;
    }

    // getters
    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas;
    }
}

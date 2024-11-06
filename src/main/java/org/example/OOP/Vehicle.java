package org.example.OOP;

public abstract class Vehicle {

    // 3 atributos
    private String brand;
    protected int velocity;
    protected int ruedas;


    // constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.velocity = 0;
    }

    // metodos
    public abstract void acelerar();  // vehiculo no implementa acelerar, siendo abstracto

    public String getBrand() { return brand; }

    public int getVelocity() { return velocity; }

    public int getRuedas() { return ruedas; }


    /*
    public void frenar() {
        this.velocity -= 10;
    }

    // getters
    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas; */
    }


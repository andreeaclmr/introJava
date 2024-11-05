package org.example.OOP;

public class Car extends  Vehicle{

    @Override
    public void acelerar() {
        super.acelerar();
        this.velocity = 20;
    }

    @Override
    public void frenar() {
        super.frenar();
        this.velocity = 20;
    }

    public Car(String brand) {
    super(brand);
    this.ruedas = 4;
}
}

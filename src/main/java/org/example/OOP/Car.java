package org.example.OOP;

public class Car extends  Vehicle{


    // sobre escribir/ override
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

    // metodo
    public Car(String brand) {
    super(brand);
    this.ruedas = 4;
}
}

package org.example.OOP;

public class Moto extends Vehicle{


    @Override
    public void frenar() {
        super.frenar();
        this.velocity = 30;
    }

    @Override
    public void acelerar() {
        super.acelerar();
        this.velocity = 30;
    }

    public Moto(String brand) {
        super(brand);
        this.ruedas = 2;



    }


}

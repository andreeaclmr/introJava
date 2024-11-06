package org.example.OOP;

public class Main {

    public static void main(String[] args) {

        // crea objetos coche y moto
        Car car1 = new Car("Seat");
        Moto moto1 = new Moto("Yamaha");
        Camion camion1 = new Camion("Volvo");

        car1.acelerar();
        moto1.acelerar();

        car1.frenar();
        moto1.frenar();

        car1.acelerar();
        moto1.acelerar();

        System.out.println("Coche: ");
        System.out.println(car1.getVelocity());
        System.out.println("Ruedas: " + car1.getRuedas());
        System.out.println("Moto: ");
        System.out.println(moto1.getVelocity());
        System.out.println("Ruedas: " + moto1.getRuedas());


    }

}
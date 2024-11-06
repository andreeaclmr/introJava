package org.example.OOP;

import java.util.List;

public class Race {

    List<Vehicle> peloton = List.of(new Camion("Camion"), new Car("Coche"), new Moto("Moto"));

    public void startRace(List<Vehicle> peloton) {
        for (Vehicle vehicle : peloton) {
            vehicle.acelerar();
            System.out.println(vehicle);
        }
    }



    }

// Una clase Race ->
//  - que al crearla cree un peloton de vehiculos.
//  - publi void start() -> todos los vehiculos del pelotón aceleren a vez





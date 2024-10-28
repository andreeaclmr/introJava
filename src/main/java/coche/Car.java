package coche;

// - **Atributos** (variables de instancia):
//    - `marca` (String)
//    - `modelo` (String)
//    - `año` (int)
//    - `kilometraje` (double)


public class Car {
    private String brand;
    private String model;
    private int year;
    private double km;

    // constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    };

    // Un método conducir(double km) que incremente el kilometraje en la cantidad de kilómetros km proporcionada.
    public double drive(double km) {
        double kmCounter = km;
        double newCounter = this.km + kmCounter;
        System.out.println(newCounter);
        return newCounter;
    }


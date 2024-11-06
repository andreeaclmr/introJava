package org.example.OOP;

public class Car extends  Vehicle{

    // metodo
    public Car(String brand) {
    super(brand);
    this.ruedas = 4;
}

    // sobre escribir/ override
    @Override
    public void acelerar() {
        this.velocity += 20;
    }

    @Override
    public String toString() {
        return "El coche va a: " + this.velocity + " Km/h";
    }


}

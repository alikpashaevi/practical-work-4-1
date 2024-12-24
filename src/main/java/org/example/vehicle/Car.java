package org.example.vehicle;

public class Car extends Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void printDetails() {
        System.out.println("Car " + model + " is going at " + speed + "km/h");
    }
}

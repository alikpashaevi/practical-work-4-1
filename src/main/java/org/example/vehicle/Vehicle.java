package org.example.vehicle;

public class Vehicle {
    protected int speed = 0;

    public void accelerate() {
        speed += 10;
    }

    public void decelrate() {
        speed -= 10;
    }
}

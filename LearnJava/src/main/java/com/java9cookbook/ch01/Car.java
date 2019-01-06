package com.java9cookbook.ch01;

public class Car extends  Vehicle {
    int passengersCount;

    public Car(int passengersCount, double weight, Engine engine){
        super(weight,engine);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    @Override
    public double getMaxWeightPound() {
        return this.getWeight() + getPassengersCount() * 230;
    }
}

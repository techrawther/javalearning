package com.java9cookbook.ch01;

public class Truck extends Vehicle{
    double payload;
    public Truck(double weight, int payloadPound, Engine engine){
        super(weight,engine);
        this.payload = payloadPound;
    }

    public double getPayload() {
        return payload;
    }

    @Override
    public double getMaxWeightPound() {
        return this.getWeight() + this.payload;
    }
}

package com.java9cookbook.ch01;

public abstract class Vehicle {
    private double weight;
    public Engine  engine;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public Vehicle(double weight, Engine engine){
        if (engine == null){
            throw new RuntimeException("Engine  cannot be null");
        }
        else {
            this.engine = engine;
            this.weight = weight;
        }
    }

    public abstract double getMaxWeightPound();

    protected double getSpeedMph(double timeinSec){
        double velocity = 2.0 * engine.getEnginepower() * 746;
        velocity = velocity * timeinSec * 32.174 / getMaxWeightPound();
        return Math.round(Math.sqrt(velocity) * 0.68 ) ;
    }

}

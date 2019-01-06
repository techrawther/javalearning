package com.java9cookbook.ch01;

public class FindSpeed {
    public static void main(String... args) {
        int weight = 4000;
        int enginepower = 246;
        Engine engine= new Engine();
        engine.setEnginepower(enginepower);

        Car car = new Car(4,weight,engine);
        System.out.println("Car WEight is " + car.getWeight() +
                "\nCar max weight is "  + car.getMaxWeightPound() +
                "\n Number of passengers is " + car.getPassengersCount() +
                "\n Engine  power is " + car.engine.getEnginepower());


        System.out.println(car.getWeight()+ "\t" + car.getSpeedMph(10)+ " mph");
        var truckEngine = new Engine();
        truckEngine.setEnginepower(246);
        var newtruck =  new Truck(3300,4000, truckEngine);
        System.out.println(newtruck.getMaxWeightPound()+ "\t" + newtruck.getSpeedMph(10)+ " mph" + " Truck payload is " + newtruck.getMaxWeightPound());
    }
}

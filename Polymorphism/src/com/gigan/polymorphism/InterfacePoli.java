package com.gigan.polymorphism;

interface Vehicle {
    void start();

}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }
}





public class InterfacePoli {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        myCar.start();
        myTruck.start();
    }
}

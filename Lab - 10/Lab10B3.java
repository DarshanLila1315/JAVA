/*Write  a  Java  program  to  create  an  abstract  class  Vehicle  with  abstract  methods 
startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the 
Vehicle class and implement the respective methods to start and stop the engines for 
each vehicle type*/

import  java.util.*;

public class Lab10B3 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        System.out.println();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}

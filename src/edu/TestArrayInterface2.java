package edu;

public class TestArrayInterface2 {
    public static void main(String[] args) {
        Vehicle[] vehicleArr = {
                new Car(),
                new Bus(),
                null
        };
        System.out.println(vehicleArr[0] + " " + vehicleArr[2]);
    }
}

abstract class Vehicle{}
class Car extends Vehicle{}
class Bus extends Vehicle{}
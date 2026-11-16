package com.uber.lld;

public class Car extends Vehicle{

    public Car(String vehicleID, String licensePlate, int seatingCapacity)
    {
        super(vehicleID, licensePlate, seatingCapacity);
        System.out.println("Car constructor called");
    }

    @Override
    protected double getBaseRate()
    {
        return 12.0; // INR 12 per KM
    }
}

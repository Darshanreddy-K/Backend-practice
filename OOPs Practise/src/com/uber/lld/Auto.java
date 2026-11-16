package com.uber.lld;

public class Auto extends Vehicle{

    public Auto(String vehicleID, String licensePlate)
    {
        super(vehicleID, licensePlate, 3);
        System.out.println("Auto constructor called");
    }

    @Override
    protected double getBaseRate()
    {
        return 8.0;
    }
}

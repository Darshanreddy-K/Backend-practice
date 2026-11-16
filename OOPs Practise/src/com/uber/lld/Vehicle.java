package com.uber.lld;

public class Vehicle {
    private String vehicleID;
    private String licensePlate;
    private int seatingCapacity;

    public Vehicle(String vehicleID, String licensePlate, int seatingCapacity)
    {
        this.vehicleID = vehicleID;
        this.licensePlate = licensePlate;
        this.seatingCapacity = seatingCapacity;
        System.out.println("Vehicle constructor called for: " + vehicleID);
    }

    public void register()
    {
        System.out.println("Vehicle " + vehicleID + " registered successfully.");
    }

    public double calculateFare(double km)
    {
        return km * getBaseRate();
    }

    protected  double getBaseRate()
    {
        return 0.0;
    }

    public String getVehicleID()
    {
        return vehicleID;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public int getSeatingCapacity()
    {
        return seatingCapacity;
    }




}

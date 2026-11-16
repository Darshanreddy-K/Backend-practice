package com.uber.lld;

public class XUV3x0 extends Car {

    public XUV3x0(String vehicleID, String licensePlate)
    {
        super(vehicleID, licensePlate, 5);
        System.out.println("XUV3x0 constructor called");
    }

    @Override
    protected double getBaseRate()
    {
        return 15.0;
    }
}

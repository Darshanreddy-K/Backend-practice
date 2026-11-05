package com.uber.lld;

public class User{

    public static void main (String args[])
    {

        Driver d1 = new Driver("D-1", "Ravi", 4.9, "91825025595");
        Driver d2 = new Driver("D-2", "Ravi", 3.0, "98358458495");
        Driver d3 = new Driver();

//        System.out.println(d1.getDriverID() + " " + d1.getDriverName() +  " " + d1.getRating());
//        System.out.println(d2.getDriverID() + " " + d2.getDriverName() +   " " + d2.getRating());
//
//        //Static members acessed through class name Uber.lld.Driver
//        System.out.println("Total drivers: "+Uber.lld.Driver.getTotalDrivers());

        System.out.print(d2.toString());
    }
}
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

        System.out.println(d2.toString());


        Fare f1 = new Fare(150, 1.2, "INR");
        System.out.println(f1.getTotalfare());

        XUV3x0 xuv3x0_01 = new XUV3x0( "V-001","KA40N4597");
        System.out.println( xuv3x0_01.toString());
        System.out.println(xuv3x0_01.calculateFare(15));
    }
}
package com.uber.lld;

public class Driver{
    static int totalDriversOnboarded = 0;
    static String systemVersion;

    private final String driverId;
    private String name;
    private double rating;
    private boolean isOnline;
    private String phone;

    static{
        systemVersion = "v2.4.5";
        System.out.println("Driver System Initialized");
    }

    public Driver()
    {
        this.driverId = "UNKNOWN";
        this.name = "UNKNOWN";
        this.rating = 0.0;
        this.isOnline = false;
        this.phone = "UNKNOWN";
        totalDriversOnboarded++;
    }

    public Driver(String driverId, String name, double rating, String phone)
    {
        this.driverId = driverId;
        this.name = name;
        this.rating = rating;
        this.isOnline = false;
        this.phone = phone;
        totalDriversOnboarded++;
    }

    public Driver(Driver other)
    {
        this.driverId = other.driverId;
        this.name = other.name;
        this.rating = other.rating;
        this.isOnline = other.isOnline;
        this.phone = other.phone;
    }

    public void goOnline()
    {
        isOnline = true;
    }

    public void goOffline()
    {
        isOnline = false;
    }

    public void acceptRide(String rideId)
    {
        System.out.println(name + "accepted ride "+ rideId);
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(double rating)
    {
        if(rating < 0 || rating > 5)
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        this.rating = rating;
    }

    public String getMaskedPhone()
    {
        if(phone == null)
            return "Not provided";
        return phone.substring(0, 3) + "*****" + phone.substring(8);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getDriverId()
    {
        return driverId;
    }

    public static int getTotalDriversOnboarded()
    {
        return totalDriversOnboarded;
    }

    public boolean isEligibleToOnboard(int age, double minimumRating)
    {
        return age >= 18 && minimumRating >= 3.5;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", isOnline=" + isOnline +
                ", phone='" + phone + '\'' +
                '}';
    }
}
package com.uber.lld;

public final class Fare {

    private final double baseFare;
    private final double surgeMultiplier;
    private final String currency;

    public Fare(double baseFare, double surgeMultiplier, String currency)
    {
        this.baseFare = baseFare;
        this.surgeMultiplier = surgeMultiplier;
        this.currency = currency;
    }

    public double getTotalfare()
    {
        return baseFare * surgeMultiplier;
    }

    public double getSurgeMultiplier()
    {
        return surgeMultiplier;
    }

    public String getCurrency()
    {
        return currency;
    }

    public double getBaseFare()
    {
        return baseFare;
    }


}

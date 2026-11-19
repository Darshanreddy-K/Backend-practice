package copyConstructor;

public class Fare {

    int fareID;
    double amount;
    Route route;

    public Fare(int fareID, double amount, Route route) {
        this.fareID = fareID;
        this.amount = amount;
        this.route = route;
    }

    public Fare(Fare other)
    {
        this.fareID = other.fareID;
        this.amount = other.amount;
        this.route = new Route(other.route);
    }
}

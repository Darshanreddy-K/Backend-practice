package copyConstructor;

import com.uber.lld.Fare;

public class Trip {
    String tripID;
    Fare fare;
    Route route;


    public Trip(String tripID, Fare fare, Route route) {
        this.tripID = tripID;
        this.fare = fare;
        this.route = route;
    }
}

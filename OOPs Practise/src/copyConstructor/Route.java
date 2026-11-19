package copyConstructor;

public class Route {

    int routeID;
    String source;
    String destination;

    public Route(int routeID, String source, String destination) {
        this.routeID = routeID;
        this.source = source;
        this.destination = destination;
    }

    public Route(Route other)
    {
        this.routeID = other.routeID;
        this.source = other.source;
        this.destination = other.destination;
    }
}

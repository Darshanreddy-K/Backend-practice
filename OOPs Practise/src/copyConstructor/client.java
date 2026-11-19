package copyConstructor;

import java.util.Scanner;

public class client {

    public static void main (String args[]) {

        Route r1 = new Route(1, "Bangalore", "Mysore");
        Fare f1 = new Fare(1, 500, r1);
        Fare f3 = new Fare(f1);
    }
}

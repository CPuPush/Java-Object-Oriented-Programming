package programmer.handal.app;

import programmer.handal.data.City;
import programmer.handal.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // Location location  = new Location(); // error Location is abstract, cannot be instantiated
        var city = new City();
        city.name = "test";
        System.out.println(city.name);
    }
}
/*
reminder
* ketika class diturunkan maka dapat mengakses field, contructor dan method.
*/

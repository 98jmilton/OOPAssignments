import java.util.ArrayList;

public abstract class BusVendor {
    //Declares bus array to be used in the inheriting classes

    ArrayList < Trip > trips = new ArrayList < > ();

    public ArrayList < Trip > getAvailableTrips() {
        return trips;
    }


}
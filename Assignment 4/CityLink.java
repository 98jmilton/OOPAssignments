public class CityLink extends BusVendor {
    /**
     * Constructor for objects of class CityLink
     */
    public CityLink() {
        //Adding data to bus timetable
        trips.add(new Trip("CityLink", "Galway", "Dublin", "20/11/2018", "14:00", "20/11/2018", "16:20", 18.40));
        trips.add(new Trip("CityLink", "Galway", "Cork", "20/11/2018", "13:00", "20/11/2018", "15:30", 16.70));
        trips.add(new Trip("CityLink", "Galway", "Belfast", "20/11/2018", "12:00", "20/11/2018", "13:42", 18.40));
        trips.add(new Trip("CityLink", "Galway", "Waterford", "20/11/2018", "11:00", "20/11/2018", "11:42", 14.34));
    }
}
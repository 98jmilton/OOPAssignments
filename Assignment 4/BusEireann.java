public class BusEireann extends BusVendor {

    public BusEireann() {
        //Adding data to bus timetable
        trips.add(new Trip("BusEireann", "Galway", "Dublin", "20/11/2018", "16:00", "20/11/2018", "18:20", 18.40));
        trips.add(new Trip("BusEireann", "Galway", "Cork", "20/11/2018", "16:00", "20/11/2018", "18:30", 16.70));
        trips.add(new Trip("BusEireann", "Galway", "Belfast", "20/11/2018", "15:00", "20/11/2018", "16:42", 18.40));
        trips.add(new Trip("BusEireann", "Galway", "Waterford", "20/11/2018", "14:00", "20/11/2018", "14:42", 14.34));
    }


}
public class GoBus extends BusVendor {
    public GoBus() {
        //Adding data to bus timetable
        trips.add(new Trip("GoBus", "Galway", "Dublin", "20/11/2018", "13:00", "20/11/2018", "16:20", 18.20));
        trips.add(new Trip("GoBus", "Galway", "Cork", "20/11/2018", "11:00", "20/11/2018", "13:30", 17.20));
        trips.add(new Trip("GoBus", "Galway", "Belfast", "20/11/2018", "14:00", "20/11/2018", "15:42", 17.90));
        trips.add(new Trip("GoBus", "Galway", "Waterford", "20/11/2018", "17:00", "20/11/2018", "17:42", 14.84));
    }

}
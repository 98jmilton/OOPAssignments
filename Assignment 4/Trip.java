public class Trip {
    //initialization of the Trip object
    private String company;
    private String startingLocation;
    private String destination;
    private String dateOfDeparture;
    private String timeOfDeparture;
    private String dateOfArrival;
    private String timeOfArrival;
    private double fare;

    public Trip(String company,
                String startingLocation,
                String destination,
                String dateOfDeparture,
                String timeOfDeparture,
                String dateOfArrival,
                String timeOfArrival,
                double fare) {
        this.company = company;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.fare = fare;
    }

    //getters of internal trip data

    public String getStartingLocation() {
        return startingLocation;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public double getFare() {
        return fare;
    }

    public String getCompany() {
        return company;
    }
}
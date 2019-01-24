import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.ArrayList;

class TravelIreland {
    ArrayList < Trip > goBusTrip = new ArrayList < > ();
    ArrayList < Trip > busEireannTrip = new ArrayList < > ();
    ArrayList < Trip > cityLinkTrip = new ArrayList < > ();
    private boolean bookingFound = false;


    TravelIreland() {
        GoBus goBus = new GoBus();
        goBusTrip = goBus.getAvailableTrips();
        BusEireann busEireann = new BusEireann();
        busEireannTrip = busEireann.getAvailableTrips();
        CityLink cityLink = new CityLink();
        cityLinkTrip = cityLink.getAvailableTrips();

    }

    void printAllAvailableTrips() {
        System.out.println("Timetables for Bus services in Galway: \n");
        System.out.println("////////////////////////");
        System.out.println("Schedule for GoBus:");
        for (Trip trip: goBusTrip) {
            printTrip(trip);
        }
        System.out.println("//////////////////////// \n");
        System.out.println("Schedule for Bus Eireann:");
        for (Trip trip: busEireannTrip) {
            printTrip(trip);
        }
        System.out.println("//////////////////////// \n");
        System.out.println("Schedule for City Link:");
        for (Trip trip: cityLinkTrip) {
            printTrip(trip);
        }
        System.out.println("//////////////////////// \n");

    }

    private void printTrip(Trip trip) {
        // basic print format for bus data
        System.out.println("From: " + trip.getStartingLocation() + " || To: " + trip.getDestination());
        System.out.println("Date: " + trip.getDateOfDeparture());
        System.out.println("Departure Time: " + trip.getTimeOfDeparture());
        System.out.println("Arrival time: " + trip.getTimeOfArrival());
        System.out.println("Cost: " + trip.getFare());
        System.out.println("\n");

    }

    private void userSearch(String search) {
        System.out.println("The following results from matched your search of \"" + search + "\":\n");
        // passes each individual array representing each company through the search algorithm
        for (Trip trip: cityLinkTrip) {
            searchFor(trip, search);
        }
        for (Trip trip: goBusTrip) {
            searchFor(trip, search);
        }
        for (Trip trip: busEireannTrip) {
            searchFor(trip, search);
        }

    }
    void searchFor(Trip trip, String search) {
        //compairs the string to the internal values of each bus timetable
        if (trip.getStartingLocation().equals(search) ||
                trip.getDestination().equals(search) ||
                trip.getDateOfDeparture().equals(search) ||
                trip.getTimeOfDeparture().equals(search) ||
                trip.getDateOfArrival().equals(search) ||
                trip.getTimeOfArrival().equals(search) ||
                String.valueOf(trip.getFare()).equals(search) ||
                trip.getCompany().equals(search)) {
            System.out.println("Company: " + trip.getCompany());
            printTrip(trip);
        }


    }
    private void Booking(String startFrom, String destination, String company, int noTickets) {
        for (Trip trip: cityLinkTrip) {
            checkBooking(trip, startFrom, destination, company, noTickets);
        }
        for (Trip trip: goBusTrip) {
            checkBooking(trip, startFrom, destination, company, noTickets);
        }
        for (Trip trip: busEireannTrip) {
            checkBooking(trip, startFrom, destination, company, noTickets);
        }
        if (bookingFound == false) {
            System.out.println("Sorry this service was not found.");
        }
    }

    private void checkBooking(Trip trip, String startFrom, String destination, String company, int noTickets) {
        if (trip.getCompany().equals(company) &&
                trip.getStartingLocation().equals(startFrom) &&
                trip.getDestination().equals(destination)) {
            float price = 0;
            if (noTickets > 0) {
                for (int i = 0; i < noTickets; i++) {
                    price += trip.getFare();
                }
            }
            System.out.println("////////////////////////");
            System.out.println("Thank you for booking. Here is your ticket:");
            printTrip(trip);
            System.out.println("You have bought " + noTickets + " ticket(s) for the price of: " + price);
            System.out.println("////////////////////////");
            bookingFound = true;
        }
    }

    public static void main(String[] args) {
        TravelIreland TravelIreland = new TravelIreland();
        // prints All trips booked
        TravelIreland.printAllAvailableTrips();

        //Searches through all services for data
        TravelIreland.userSearch("Dublin");

        //Books a ticket for user
        TravelIreland.Booking("Galway", "Dublin", "BusEireann", 3);
    }




}
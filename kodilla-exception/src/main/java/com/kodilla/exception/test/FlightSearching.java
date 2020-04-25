package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearching {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Pyrzowice", true);
        flights.put("Heathrow", false);

        if(flights.containsKey(flight.getArrivalAirport()) || flights.containsKey(flight.getDepartureAirport())){
            System.out.println(flight);
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightSearching flightSearching = new FlightSearching();

        try {
            flightSearching.findFlight(new Flight("Balice", "Wrocław"));
        } catch (RouteNotFoundException e) {
            System.out.println("Map doesn't contain chosen airport.");
        }
    }
}

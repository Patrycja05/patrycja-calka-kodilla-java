package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {

    public List<Airport> flights(){
        List<Airport> listOfFlights = new ArrayList<>();

        listOfFlights.add(new Airport("Gdańsk", "", "Wrocław"));
        listOfFlights.add(new Airport("Kraków", "", "Wrocław"));
        listOfFlights.add(new Airport("Kraków", "Warszawa", "Budapeszt"));
        listOfFlights.add(new Airport("Berlin", "Hamburg", "Bukareszt"));
        listOfFlights.add(new Airport("Katowice", "Wrocław", "Kraków"));

        return listOfFlights;
    }
}

package com.kodilla.good.patterns.challenges.flights;

import java.util.stream.Collectors;

public class FlightsService {

    public void searchArrivalAirport(){
        FlightsRepository flightsRepository = new FlightsRepository();
        flightsRepository.gdanskWroclawFlights().entrySet().stream()
                .map(list -> list.getKey())
                .forEach(System.out::println);

    }

    public void searchDepartureAirport(){
        FlightsRepository flightsRepository = new FlightsRepository();
        flightsRepository.gdanskWroclawFlights().entrySet().stream()
                .map(list -> list.getKey().getDepartureAirport())
                .collect(Collectors.joining(" ! "));
    }
}

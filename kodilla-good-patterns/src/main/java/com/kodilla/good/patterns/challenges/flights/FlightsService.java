package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsService {

    public void searchArrivalAirport(String arrivalAirport){
        FlightsRepository flightsRepository = new FlightsRepository();
        List<Airport> result =  flightsRepository.flights().stream()
                .filter(e -> e.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public void searchDepartureAirport(String departureAirport){
        FlightsRepository flightsRepository = new FlightsRepository();
        List<Airport> result1 = flightsRepository.flights().stream()
                .filter(e -> e.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
        System.out.println(result1);
    }

    public void searchTransferAirport(String transferAirport){
        FlightsRepository flightsRepository = new FlightsRepository();
        List<Airport> result2 = flightsRepository.flights().stream()
                .filter(e -> e.getTransferAirport().equals(transferAirport))
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}

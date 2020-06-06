package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Airport {
    private String arrivalAirport;
    private String transferAirport;
    private String departureAirport;

    public Airport(String arrivalAirport, String transferAirport, String departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.transferAirport = transferAirport;
        this.departureAirport = departureAirport;
    }

    public String getTransferAirport() {
        return transferAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(arrivalAirport, airport.arrivalAirport) &&
                Objects.equals(departureAirport, airport.departureAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalAirport, departureAirport);
    }
}

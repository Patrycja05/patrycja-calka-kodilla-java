package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Objects;

public class FlightsRepository {
    private HashMap<Airport, LocalTime> listOfGdanskWroclawFlights;

    public HashMap<Airport, LocalTime> gdanskWroclawFlights(){
        Airport gdanskWroclaw = new Airport("Gdańsk", "Wrocław");
        LocalTime time1 = LocalTime.of(02,00,00);
        LocalTime time2 = LocalTime.of(07,35,00);
        LocalTime time3 = LocalTime.of(10,50,00);
        LocalTime time4 = LocalTime.of(12,30,00);
        LocalTime time5 = LocalTime.of(17,20,00);
        LocalTime time6 = LocalTime.of(21,10,00);

        listOfGdanskWroclawFlights.put(gdanskWroclaw, time1);
        listOfGdanskWroclawFlights.put(gdanskWroclaw, time2);
        listOfGdanskWroclawFlights.put(gdanskWroclaw, time3);
        listOfGdanskWroclawFlights.put(gdanskWroclaw, time4);
        listOfGdanskWroclawFlights.put(gdanskWroclaw, time5);
        listOfGdanskWroclawFlights.put(gdanskWroclaw, time6);

        return listOfGdanskWroclawFlights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightsRepository that = (FlightsRepository) o;
        return Objects.equals(listOfGdanskWroclawFlights, that.listOfGdanskWroclawFlights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfGdanskWroclawFlights);
    }
}

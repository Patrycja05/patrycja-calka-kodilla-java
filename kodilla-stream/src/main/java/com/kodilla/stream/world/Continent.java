package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;

import java.util.HashMap;

public class Continent {
    private final HashMap<World, Country> countriesPerContinent = new HashMap<>();

    public void addCountry() {
        World asia = new World("Asia");
        World europe = new World("Europe");
        World africa = new World("Africa");
        countriesPerContinent.put(asia, new Country("China"));
        countriesPerContinent.put(asia, new Country("Japan"));
        countriesPerContinent.put(europe, new Country("Poland"));
        countriesPerContinent.put(europe, new Country("Albania"));
        countriesPerContinent.put(africa, new Country("SA"));
        countriesPerContinent.put(africa, new Country("Gambia"));
    }
}

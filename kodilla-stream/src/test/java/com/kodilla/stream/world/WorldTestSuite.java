package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void getPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country italy = new Country("Italy", new BigDecimal("4500000"));
        Country china = new Country("China", new BigDecimal("4509750"));
        Country thailand = new Country("Thailand", new BigDecimal("9356722"));
        Country sa = new Country("SA", new BigDecimal("45093211"));
        Country egypt = new Country("Egypt", new BigDecimal("922356722"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(italy);
        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(thailand);
        Continent africa = new Continent("Africa");
        africa.addCountry(sa);
        africa.addCountry(egypt);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        BigDecimal peopleQuantitySum = new BigDecimal("1023816405");

        //When
        BigDecimal peopleQuantityTest = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(peopleQuantitySum, peopleQuantityTest);
    }
}

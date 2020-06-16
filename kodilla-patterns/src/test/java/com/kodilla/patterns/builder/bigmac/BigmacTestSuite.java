package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun")
                .burgers(2)
                .souce("spicy")
                .ingredient("mushrooms")
                .ingredient("double cheese")
                .ingredient("ham")
                .build();
        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whichSouce = "spicy";

        //Then
        Assert.assertEquals(3, numberOfIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("spicy", whichSouce);
    }
}

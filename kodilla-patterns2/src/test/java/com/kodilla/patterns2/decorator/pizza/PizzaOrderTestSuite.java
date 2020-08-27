package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testHawaiFastDeliveryPizzaGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaDecorator();
        pizzaOrder = new HawaiDecorator(pizzaOrder);
        pizzaOrder = new FastDeliveryDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(7), cost);
    }

    @Test
    public void testHawaiFastDeliveryPizzaGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaDecorator();
        pizzaOrder = new HawaiDecorator(pizzaOrder);
        pizzaOrder = new FastDeliveryDecorator(pizzaOrder);
        //When
        String pizzaOrderDescription = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza order: mozzarella, tomato souce + ham + pineapple FAST DELIVERY", pizzaOrderDescription);
    }

    @Test
    public void testVegetarianaExtraMozzarellaGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaDecorator();
        pizzaOrder = new VegetarianaDecorator(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(6), cost);
    }

    @Test
    public void testVegetarianaExtraMozzarellaGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaDecorator();
        pizzaOrder = new VegetarianaDecorator(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        //When
        String pizzaOrderDescription = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza order: mozzarella, tomato souce + mushrooms + onions + beans + extra mozzarella", pizzaOrderDescription);
    }

    @Test
    public void testBasicPizzaDoubleMozzarellaExtraChickenGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaDecorator();
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new ExtraChickenDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(7), cost);
    }

    @Test
    public void testBasicPizzaDoubleMozzarellaExtraChickenGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaDecorator();
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new ExtraChickenDecorator(pizzaOrder);
        //When
        String pizzaOrderDescription = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza order: mozzarella, tomato souce + extra mozzarella + extra mozzarella + chicken", pizzaOrderDescription);
    }
}

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaDecorator implements PizzaOrder {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(3);
    }

    @Override
    public String getDescription(){
        return "Pizza order: mozzarella, tomato souce";
    }
}

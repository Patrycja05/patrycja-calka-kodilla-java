package com.kodilla.good.patterns.challenges.food2Door;

public class Food2DoorMain {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        extraFoodShop.process(new Product(20, "Oat milk"));
        glutenFreeShop.process(new Product(3, "Gluten-free flour"));
        healthyShop.process(new Product(70, "Vegan burger"));
    }
}

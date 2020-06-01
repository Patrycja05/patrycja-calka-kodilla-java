package com.kodilla.good.patterns.challenges.food2Door;

public class Warehouse {
    private String extraFood = "Extra Food";
    private String glutenFree = "Gluten Free";
    private String healthyShop = "Healthy Shop";

    public void takeOrder(Order order){
        if(order.getSupplierName().equals(extraFood)){
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            extraFoodShop.process(order.getProduct());
        }

        if(order.getSupplierName().equals(glutenFree)){
            GlutenFreeShop glutenFreeShop = (new GlutenFreeShop());
            glutenFreeShop.process(order.getProduct());
        }

        if(order.getSupplierName().equals(healthyShop)){
            HealthyShop healthyShop = new HealthyShop();
            healthyShop.process(order.getProduct());
        }
    }
}

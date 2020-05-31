package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements SupplierRepository {
    public String SUPPLIERNAME = "HealthyShop";

    @Override
    public void process(Product product) {
        System.out.println("Dear " + SUPPLIERNAME + " please prepare: " + product + ".");
        if(product.productQuantity > 50){
            System.out.println("Order: over 50 products. Charge a 10% discount.");
        }
    }
}

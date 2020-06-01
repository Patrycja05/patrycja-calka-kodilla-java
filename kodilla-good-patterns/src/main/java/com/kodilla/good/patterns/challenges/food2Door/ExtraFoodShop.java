package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop implements SupplierRepository{
    public String SUPPLIERNAME = "ExtraFoodShop";

    @Override
    public void process(Product product) {
        System.out.println("Dear " + SUPPLIERNAME + " please prepare: " + product + ".");
        if (product.productQuantity > 30) {
            System.out.println("Act quickly! User bought over 30 products.");
        }
    }
}

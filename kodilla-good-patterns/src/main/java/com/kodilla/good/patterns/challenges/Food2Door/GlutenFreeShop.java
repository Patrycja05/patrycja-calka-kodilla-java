package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements SupplierRepository {
    public String SUPPLIERNAME = "GlutenFreeShop";

    @Override
    public void process(Product product) {
        System.out.println("Dear " + SUPPLIERNAME + " please prepare: " + product + ".");
    }
}

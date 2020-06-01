package com.kodilla.good.patterns.challenges.food2Door;

public class Order {
    private String supplierName;
    private String userName;
    private Product product;

    public Order(String supplierName, String userName, Product product) {
        this.supplierName = supplierName;
        this.userName = userName;
        this.product = product;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }
}
